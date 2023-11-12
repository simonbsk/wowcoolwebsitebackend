-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 13. Nov 2023 um 00:10
-- Server-Version: 10.4.27-MariaDB
-- PHP-Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `wowcoolwebsitedb`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `chart_data_table`
--

CREATE TABLE `chart_data_table` (
  `chart_data_id` int(11) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `data_id` int(11) DEFAULT NULL,
  `options_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `chart_data_table`
--

INSERT INTO `chart_data_table` (`chart_data_id`, `type`, `data_id`, `options_id`) VALUES
(1, 'scatter', 1, 1),
(2, 'line', 2, 2),
(3, 'bar', 3, 3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `chart_table`
--

CREATE TABLE `chart_table` (
  `chart_id` int(11) NOT NULL,
  `chart_name` varchar(255) NOT NULL,
  `chart_data_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `chart_table`
--

INSERT INTO `chart_table` (`chart_id`, `chart_name`, `chart_data_id`) VALUES
(123, 'test graph 1', 1),
(456, 'test graph 1', 2),
(789, 'test graph 1', 3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `dataset_bar_color_table`
--

CREATE TABLE `dataset_bar_color_table` (
  `dataset_id` int(11) NOT NULL,
  `bar_color` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `dataset_bar_color_table`
--

INSERT INTO `dataset_bar_color_table` (`dataset_id`, `bar_color`) VALUES
(1, 'yellow'),
(2, 'orange'),
(3, 'purple');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `dataset_border_color_table`
--

CREATE TABLE `dataset_border_color_table` (
  `dataset_id` int(11) NOT NULL,
  `border_color` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `dataset_border_color_table`
--

INSERT INTO `dataset_border_color_table` (`dataset_id`, `border_color`) VALUES
(1, 'red'),
(2, 'blue'),
(3, 'green');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `dataset_data_table`
--

CREATE TABLE `dataset_data_table` (
  `dataset_id` int(11) NOT NULL,
  `data` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `dataset_data_table`
--

INSERT INTO `dataset_data_table` (`dataset_id`, `data`) VALUES
(1, '10'),
(2, '15'),
(3, '20');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `dataset_table`
--

CREATE TABLE `dataset_table` (
  `dataset_id` int(11) NOT NULL,
  `data_id` int(11) NOT NULL,
  `point_radius` int(11) DEFAULT NULL,
  `point_background_color` varchar(255) DEFAULT NULL,
  `fill` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `dataset_table`
--

INSERT INTO `dataset_table` (`dataset_id`, `data_id`, `point_radius`, `point_background_color`, `fill`) VALUES
(1, 1, 4, 'rgba(0,0,255,1)', 0),
(2, 2, 3, 'rgba(255,0,0,1)', 1),
(3, 3, 5, 'rgba(0,255,0,1)', 0),
(4, 4, 4, 'rgba(0,0,255,1)', 0),
(5, 5, 3, 'rgba(255,0,0,1)', 1),
(6, 6, 5, 'rgba(0,255,0,1)', 0);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `data_labels_table`
--

CREATE TABLE `data_labels_table` (
  `data_label_id` int(11) NOT NULL,
  `data_id` int(11) NOT NULL,
  `labels` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `data_labels_table`
--

INSERT INTO `data_labels_table` (`data_label_id`, `data_id`, `labels`) VALUES
(1, 1, 'test'),
(2, 2, 'test2');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `data_table`
--

CREATE TABLE `data_table` (
  `data_id` int(11) NOT NULL,
  `label` int(11) NOT NULL,
  `dataset_id` int(11) DEFAULT NULL,
  `chart_data_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `data_table`
--

INSERT INTO `data_table` (`data_id`, `label`, `dataset_id`, `chart_data_id`) VALUES
(1, 0, 1, 1),
(2, 0, 2, 2),
(3, 0, 3, 3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `legend_table`
--

CREATE TABLE `legend_table` (
  `legend_id` int(11) NOT NULL,
  `display` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `legend_table`
--

INSERT INTO `legend_table` (`legend_id`, `display`) VALUES
(1, 1),
(2, 0),
(3, 1),
(4, 1),
(5, 0),
(6, 1);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `options_table`
--

CREATE TABLE `options_table` (
  `options_id` int(11) NOT NULL,
  `title_id` int(11) DEFAULT NULL,
  `legend_id` int(11) DEFAULT NULL,
  `scales_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `options_table`
--

INSERT INTO `options_table` (`options_id`, `title_id`, `legend_id`, `scales_id`) VALUES
(1, 1, 1, 1),
(2, 2, 2, 2),
(3, 3, 3, 3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `scales_table`
--

CREATE TABLE `scales_table` (
  `scales_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `scales_table`
--

INSERT INTO `scales_table` (`scales_id`) VALUES
(1),
(2),
(3);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `ticks_table`
--

CREATE TABLE `ticks_table` (
  `ticks_id` int(11) NOT NULL,
  `min` int(11) DEFAULT NULL,
  `max` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `ticks_table`
--

INSERT INTO `ticks_table` (`ticks_id`, `min`, `max`) VALUES
(1, 6, 16),
(2, 5, 15),
(3, 7, 17),
(4, 6, 16),
(5, 5, 15),
(6, 7, 17);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `title_table`
--

CREATE TABLE `title_table` (
  `title_id` int(11) NOT NULL,
  `display` tinyint(1) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `title_table`
--

INSERT INTO `title_table` (`title_id`, `display`, `text`) VALUES
(1, 1, 'Graph 1 Title'),
(2, 1, 'Graph 2 Title'),
(3, 1, 'Graph 3 Title'),
(4, 1, 'Graph 1 Title'),
(5, 1, 'Graph 2 Title'),
(6, 1, 'Graph 3 Title');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `yaxis_table`
--

CREATE TABLE `yaxis_table` (
  `yaxis_id` int(11) NOT NULL,
  `scales_id` int(11) NOT NULL,
  `ticks_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Daten für Tabelle `yaxis_table`
--

INSERT INTO `yaxis_table` (`yaxis_id`, `scales_id`, `ticks_id`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 1),
(5, 5, 2),
(6, 6, 3);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `chart_data_table`
--
ALTER TABLE `chart_data_table`
  ADD PRIMARY KEY (`chart_data_id`),
  ADD KEY `data_id` (`data_id`),
  ADD KEY `options_id` (`options_id`);

--
-- Indizes für die Tabelle `chart_table`
--
ALTER TABLE `chart_table`
  ADD PRIMARY KEY (`chart_id`),
  ADD KEY `chart_data_id` (`chart_data_id`);

--
-- Indizes für die Tabelle `dataset_bar_color_table`
--
ALTER TABLE `dataset_bar_color_table`
  ADD PRIMARY KEY (`dataset_id`,`bar_color`);

--
-- Indizes für die Tabelle `dataset_border_color_table`
--
ALTER TABLE `dataset_border_color_table`
  ADD PRIMARY KEY (`dataset_id`,`border_color`);

--
-- Indizes für die Tabelle `dataset_data_table`
--
ALTER TABLE `dataset_data_table`
  ADD PRIMARY KEY (`dataset_id`,`data`);

--
-- Indizes für die Tabelle `dataset_table`
--
ALTER TABLE `dataset_table`
  ADD PRIMARY KEY (`dataset_id`);

--
-- Indizes für die Tabelle `data_labels_table`
--
ALTER TABLE `data_labels_table`
  ADD PRIMARY KEY (`data_label_id`),
  ADD KEY `data_id_relation` (`data_id`);

--
-- Indizes für die Tabelle `data_table`
--
ALTER TABLE `data_table`
  ADD PRIMARY KEY (`data_id`),
  ADD KEY `dataset_id` (`dataset_id`),
  ADD KEY `fk_data_chart_data` (`chart_data_id`);

--
-- Indizes für die Tabelle `legend_table`
--
ALTER TABLE `legend_table`
  ADD PRIMARY KEY (`legend_id`);

--
-- Indizes für die Tabelle `options_table`
--
ALTER TABLE `options_table`
  ADD PRIMARY KEY (`options_id`),
  ADD KEY `title_id` (`title_id`),
  ADD KEY `legend_id` (`legend_id`),
  ADD KEY `scales_id` (`scales_id`);

--
-- Indizes für die Tabelle `scales_table`
--
ALTER TABLE `scales_table`
  ADD PRIMARY KEY (`scales_id`);

--
-- Indizes für die Tabelle `ticks_table`
--
ALTER TABLE `ticks_table`
  ADD PRIMARY KEY (`ticks_id`);

--
-- Indizes für die Tabelle `title_table`
--
ALTER TABLE `title_table`
  ADD PRIMARY KEY (`title_id`);

--
-- Indizes für die Tabelle `yaxis_table`
--
ALTER TABLE `yaxis_table`
  ADD PRIMARY KEY (`yaxis_id`),
  ADD KEY `ticks_id` (`ticks_id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `chart_data_table`
--
ALTER TABLE `chart_data_table`
  MODIFY `chart_data_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `chart_table`
--
ALTER TABLE `chart_table`
  MODIFY `chart_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=790;

--
-- AUTO_INCREMENT für Tabelle `dataset_table`
--
ALTER TABLE `dataset_table`
  MODIFY `dataset_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT für Tabelle `data_labels_table`
--
ALTER TABLE `data_labels_table`
  MODIFY `data_label_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT für Tabelle `data_table`
--
ALTER TABLE `data_table`
  MODIFY `data_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `legend_table`
--
ALTER TABLE `legend_table`
  MODIFY `legend_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT für Tabelle `options_table`
--
ALTER TABLE `options_table`
  MODIFY `options_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `scales_table`
--
ALTER TABLE `scales_table`
  MODIFY `scales_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT für Tabelle `ticks_table`
--
ALTER TABLE `ticks_table`
  MODIFY `ticks_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT für Tabelle `title_table`
--
ALTER TABLE `title_table`
  MODIFY `title_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT für Tabelle `yaxis_table`
--
ALTER TABLE `yaxis_table`
  MODIFY `yaxis_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `chart_data_table`
--
ALTER TABLE `chart_data_table`
  ADD CONSTRAINT `chart_data_table_ibfk_1` FOREIGN KEY (`data_id`) REFERENCES `data_table` (`data_id`),
  ADD CONSTRAINT `chart_data_table_ibfk_2` FOREIGN KEY (`options_id`) REFERENCES `options_table` (`options_id`);

--
-- Constraints der Tabelle `chart_table`
--
ALTER TABLE `chart_table`
  ADD CONSTRAINT `chart_table_ibfk_1` FOREIGN KEY (`chart_data_id`) REFERENCES `chart_data_table` (`chart_data_id`);

--
-- Constraints der Tabelle `dataset_bar_color_table`
--
ALTER TABLE `dataset_bar_color_table`
  ADD CONSTRAINT `dataset_bar_color_table_ibfk_1` FOREIGN KEY (`dataset_id`) REFERENCES `dataset_table` (`dataset_id`);

--
-- Constraints der Tabelle `dataset_border_color_table`
--
ALTER TABLE `dataset_border_color_table`
  ADD CONSTRAINT `dataset_border_color_table_ibfk_1` FOREIGN KEY (`dataset_id`) REFERENCES `dataset_table` (`dataset_id`);

--
-- Constraints der Tabelle `dataset_data_table`
--
ALTER TABLE `dataset_data_table`
  ADD CONSTRAINT `dataset_data_table_ibfk_1` FOREIGN KEY (`dataset_id`) REFERENCES `dataset_table` (`dataset_id`),
  ADD CONSTRAINT `dataset_id_relation` FOREIGN KEY (`dataset_id`) REFERENCES `dataset_table` (`dataset_id`);

--
-- Constraints der Tabelle `data_labels_table`
--
ALTER TABLE `data_labels_table`
  ADD CONSTRAINT `data_id_relation` FOREIGN KEY (`data_id`) REFERENCES `data_table` (`data_id`);

--
-- Constraints der Tabelle `data_table`
--
ALTER TABLE `data_table`
  ADD CONSTRAINT `data_table_ibfk_1` FOREIGN KEY (`dataset_id`) REFERENCES `dataset_table` (`dataset_id`),
  ADD CONSTRAINT `fk_data_chart_data` FOREIGN KEY (`chart_data_id`) REFERENCES `chart_data_table` (`chart_data_id`);

--
-- Constraints der Tabelle `options_table`
--
ALTER TABLE `options_table`
  ADD CONSTRAINT `options_table_ibfk_1` FOREIGN KEY (`title_id`) REFERENCES `title_table` (`title_id`),
  ADD CONSTRAINT `options_table_ibfk_2` FOREIGN KEY (`legend_id`) REFERENCES `legend_table` (`legend_id`),
  ADD CONSTRAINT `options_table_ibfk_3` FOREIGN KEY (`scales_id`) REFERENCES `scales_table` (`scales_id`);

--
-- Constraints der Tabelle `yaxis_table`
--
ALTER TABLE `yaxis_table`
  ADD CONSTRAINT `yaxis_table_ibfk_1` FOREIGN KEY (`ticks_id`) REFERENCES `ticks_table` (`ticks_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
