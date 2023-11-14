-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2023 at 03:11 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `newwowcoolwebsitedb`
--

-- --------------------------------------------------------

--
-- Table structure for table `chart`
--

CREATE TABLE `chart` (
  `id` bigint(20) NOT NULL,
  `chart_name` varchar(255) DEFAULT NULL,
  `chart_data_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chart`
--

INSERT INTO `chart` (`id`, `chart_name`, `chart_data_id`) VALUES
(1, 'Chart1', 1),
(2, 'Chart2', 2),
(3, 'Chart3', 3);

-- --------------------------------------------------------

--
-- Table structure for table `chartdata`
--

CREATE TABLE `chartdata` (
  `id` bigint(20) NOT NULL,
  `type` varchar(255) DEFAULT NULL,
  `data_id` bigint(20) DEFAULT NULL,
  `options_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chartdata`
--

INSERT INTO `chartdata` (`id`, `type`, `data_id`, `options_id`) VALUES
(1, 'scatter', 1, 1),
(2, 'scatter', 2, 2),
(3, 'scatter', 3, 3);

-- --------------------------------------------------------

--
-- Table structure for table `data`
--

CREATE TABLE `data` (
  `id` bigint(20) NOT NULL,
  `chart_data_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data`
--

INSERT INTO `data` (`id`, `chart_data_id`) VALUES
(1, 1),
(2, 1),
(3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `dataset`
--

CREATE TABLE `dataset` (
  `id` bigint(20) NOT NULL,
  `pointRadius` int(11) DEFAULT NULL,
  `pointBackgroundColor` varchar(255) DEFAULT NULL,
  `fill` tinyint(1) DEFAULT NULL,
  `data_id` bigint(20) DEFAULT NULL,
  `point_background_color` varchar(255) DEFAULT NULL,
  `point_radius` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataset`
--

INSERT INTO `dataset` (`id`, `pointRadius`, `pointBackgroundColor`, `fill`, `data_id`, `point_background_color`, `point_radius`) VALUES
(1, 4, 'rgba(0,0,255,1)', 0, 1, NULL, 0),
(2, 4, 'rgba(0,0,255,1)', 0, 1, NULL, 0),
(3, 4, 'rgba(0,0,255,1)', 0, 1, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `dataset_bar_color`
--

CREATE TABLE `dataset_bar_color` (
  `dataset_id` bigint(20) NOT NULL,
  `bar_color` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataset_bar_color`
--

INSERT INTO `dataset_bar_color` (`dataset_id`, `bar_color`) VALUES
(1, 'rgba(0,0,255,1)'),
(1, 'rgba(0,255,0,1)'),
(2, 'rgba(255,0,0,1)');

-- --------------------------------------------------------

--
-- Table structure for table `dataset_border_color`
--

CREATE TABLE `dataset_border_color` (
  `dataset_id` bigint(20) NOT NULL,
  `border_color` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataset_border_color`
--

INSERT INTO `dataset_border_color` (`dataset_id`, `border_color`) VALUES
(1, 'rgba(255,255,0,1)'),
(2, 'rgba(128,0,128,1)');

-- --------------------------------------------------------

--
-- Table structure for table `dataset_data`
--

CREATE TABLE `dataset_data` (
  `dataset_id` bigint(20) NOT NULL,
  `data` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataset_data`
--

INSERT INTO `dataset_data` (`dataset_id`, `data`) VALUES
(1, 10),
(1, 15),
(2, 20);

-- --------------------------------------------------------

--
-- Table structure for table `data_datasets`
--

CREATE TABLE `data_datasets` (
  `data_id` bigint(20) NOT NULL,
  `datasets_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_datasets`
--

INSERT INTO `data_datasets` (`data_id`, `datasets_id`) VALUES
(1, 1),
(1, 2),
(2, 3);

-- --------------------------------------------------------

--
-- Table structure for table `data_labels`
--

CREATE TABLE `data_labels` (
  `data_id` bigint(20) NOT NULL,
  `labels` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_labels`
--

INSERT INTO `data_labels` (`data_id`, `labels`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `legend`
--

CREATE TABLE `legend` (
  `id` bigint(20) NOT NULL,
  `display` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `legend`
--

INSERT INTO `legend` (`id`, `display`) VALUES
(1, 1),
(2, 0),
(3, 1),
(4, 0),
(5, 1),
(6, 0);

-- --------------------------------------------------------

--
-- Table structure for table `options`
--

CREATE TABLE `options` (
  `id` bigint(20) NOT NULL,
  `title_id` bigint(20) DEFAULT NULL,
  `legend_id` bigint(20) DEFAULT NULL,
  `scales_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `options`
--

INSERT INTO `options` (`id`, `title_id`, `legend_id`, `scales_id`) VALUES
(1, 1, 1, NULL),
(2, 2, 2, NULL),
(3, 1, 1, NULL),
(4, 2, 2, NULL),
(5, 1, 1, NULL),
(6, 2, 2, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `scales`
--

CREATE TABLE `scales` (
  `id` bigint(20) NOT NULL,
  `options_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `scales`
--

INSERT INTO `scales` (`id`, `options_id`) VALUES
(1, 1),
(3, 1),
(5, 1),
(2, 2),
(4, 2),
(6, 2);

-- --------------------------------------------------------

--
-- Table structure for table `scales_y_axes`
--

CREATE TABLE `scales_y_axes` (
  `scales_id` bigint(20) NOT NULL,
  `y_axes_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `scales_y_axes`
--

INSERT INTO `scales_y_axes` (`scales_id`, `y_axes_id`) VALUES
(1, 1),
(2, 2);

-- --------------------------------------------------------

--
-- Table structure for table `ticks`
--

CREATE TABLE `ticks` (
  `id` bigint(20) NOT NULL,
  `min` int(11) DEFAULT NULL,
  `max` int(11) DEFAULT NULL,
  `y_axes_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `ticks`
--

INSERT INTO `ticks` (`id`, `min`, `max`, `y_axes_id`) VALUES
(4, 10, 20, 1),
(5, 5, 15, 2),
(6, 10, 20, 1),
(7, 5, 15, 2);

-- --------------------------------------------------------

--
-- Table structure for table `title`
--

CREATE TABLE `title` (
  `id` bigint(20) NOT NULL,
  `display` tinyint(1) DEFAULT NULL,
  `text` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `title`
--

INSERT INTO `title` (`id`, `display`, `text`) VALUES
(1, 1, 'Title1'),
(2, 0, 'Title2'),
(3, 1, 'Title1'),
(4, 0, 'Title2'),
(5, 1, 'Title1'),
(6, 0, 'Title2');

-- --------------------------------------------------------

--
-- Table structure for table `yaxes`
--

CREATE TABLE `yaxes` (
  `id` bigint(20) NOT NULL,
  `scales_id` bigint(20) DEFAULT NULL,
  `ticks_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `yaxes`
--

INSERT INTO `yaxes` (`id`, `scales_id`, `ticks_id`) VALUES
(1, 3, 4),
(2, 4, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `chart`
--
ALTER TABLE `chart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `chart_data_id` (`chart_data_id`);

--
-- Indexes for table `chartdata`
--
ALTER TABLE `chartdata`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_nm3u36c4g50mt3ftrhbrlt64d` (`data_id`),
  ADD UNIQUE KEY `UK_h2iughygsfopm5bxmj1p0mtmv` (`options_id`);

--
-- Indexes for table `data`
--
ALTER TABLE `data`
  ADD PRIMARY KEY (`id`),
  ADD KEY `chart_data_id` (`chart_data_id`);

--
-- Indexes for table `dataset`
--
ALTER TABLE `dataset`
  ADD PRIMARY KEY (`id`),
  ADD KEY `data_id` (`data_id`);

--
-- Indexes for table `dataset_bar_color`
--
ALTER TABLE `dataset_bar_color`
  ADD KEY `FK6kad8wr1nn7d4335hsebfax8p` (`dataset_id`);

--
-- Indexes for table `dataset_border_color`
--
ALTER TABLE `dataset_border_color`
  ADD KEY `FKmwrhw3ymr1piwer8asosgtoi` (`dataset_id`);

--
-- Indexes for table `dataset_data`
--
ALTER TABLE `dataset_data`
  ADD KEY `FKp9mo5vq0f4hh9l0ywtfi4g4p5` (`dataset_id`);

--
-- Indexes for table `data_datasets`
--
ALTER TABLE `data_datasets`
  ADD UNIQUE KEY `UK_4qogklsxb08chcf92gcfheg2u` (`datasets_id`),
  ADD KEY `FKtb2d48hysco9a68704cdpni16` (`data_id`);

--
-- Indexes for table `data_labels`
--
ALTER TABLE `data_labels`
  ADD KEY `FKd1tcwfqb3mrot2l4l9ge837pb` (`data_id`);

--
-- Indexes for table `legend`
--
ALTER TABLE `legend`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `options`
--
ALTER TABLE `options`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_bu6psnluugc24loqpbvtois2a` (`scales_id`),
  ADD KEY `title_id` (`title_id`),
  ADD KEY `legend_id` (`legend_id`);

--
-- Indexes for table `scales`
--
ALTER TABLE `scales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `options_id` (`options_id`);

--
-- Indexes for table `scales_y_axes`
--
ALTER TABLE `scales_y_axes`
  ADD UNIQUE KEY `UK_hd2grwsq9qw3lcy8qnsiqdgpj` (`y_axes_id`),
  ADD KEY `FKt5liooj3y8b0l4vqs9q5g87o0` (`scales_id`);

--
-- Indexes for table `ticks`
--
ALTER TABLE `ticks`
  ADD PRIMARY KEY (`id`),
  ADD KEY `y_axes_id` (`y_axes_id`);

--
-- Indexes for table `title`
--
ALTER TABLE `title`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `yaxes`
--
ALTER TABLE `yaxes`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UK_eljgggc4918ahnf7xeb7m2wh8` (`ticks_id`),
  ADD KEY `scales_id` (`scales_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chart`
--
ALTER TABLE `chart`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `chartdata`
--
ALTER TABLE `chartdata`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `data`
--
ALTER TABLE `data`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `dataset`
--
ALTER TABLE `dataset`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `legend`
--
ALTER TABLE `legend`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `options`
--
ALTER TABLE `options`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `scales`
--
ALTER TABLE `scales`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `ticks`
--
ALTER TABLE `ticks`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `title`
--
ALTER TABLE `title`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `yaxes`
--
ALTER TABLE `yaxes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chart`
--
ALTER TABLE `chart`
  ADD CONSTRAINT `chart_ibfk_1` FOREIGN KEY (`chart_data_id`) REFERENCES `chartdata` (`id`);

--
-- Constraints for table `chartdata`
--
ALTER TABLE `chartdata`
  ADD CONSTRAINT `FK8y9d8in05ig7sguxo3tukxcdr` FOREIGN KEY (`options_id`) REFERENCES `options` (`id`),
  ADD CONSTRAINT `FKbfqle79udgcnhftemd31pt61p` FOREIGN KEY (`data_id`) REFERENCES `data` (`id`);

--
-- Constraints for table `data`
--
ALTER TABLE `data`
  ADD CONSTRAINT `data_ibfk_1` FOREIGN KEY (`chart_data_id`) REFERENCES `chartdata` (`id`);

--
-- Constraints for table `dataset`
--
ALTER TABLE `dataset`
  ADD CONSTRAINT `dataset_ibfk_1` FOREIGN KEY (`data_id`) REFERENCES `data` (`id`);

--
-- Constraints for table `dataset_bar_color`
--
ALTER TABLE `dataset_bar_color`
  ADD CONSTRAINT `FK6kad8wr1nn7d4335hsebfax8p` FOREIGN KEY (`dataset_id`) REFERENCES `dataset` (`id`);

--
-- Constraints for table `dataset_border_color`
--
ALTER TABLE `dataset_border_color`
  ADD CONSTRAINT `FKmwrhw3ymr1piwer8asosgtoi` FOREIGN KEY (`dataset_id`) REFERENCES `dataset` (`id`);

--
-- Constraints for table `dataset_data`
--
ALTER TABLE `dataset_data`
  ADD CONSTRAINT `FKp9mo5vq0f4hh9l0ywtfi4g4p5` FOREIGN KEY (`dataset_id`) REFERENCES `dataset` (`id`);

--
-- Constraints for table `data_datasets`
--
ALTER TABLE `data_datasets`
  ADD CONSTRAINT `FKscwjgwvel9kon7m4s6a281vr7` FOREIGN KEY (`datasets_id`) REFERENCES `dataset` (`id`),
  ADD CONSTRAINT `FKtb2d48hysco9a68704cdpni16` FOREIGN KEY (`data_id`) REFERENCES `data` (`id`);

--
-- Constraints for table `data_labels`
--
ALTER TABLE `data_labels`
  ADD CONSTRAINT `FKd1tcwfqb3mrot2l4l9ge837pb` FOREIGN KEY (`data_id`) REFERENCES `data` (`id`);

--
-- Constraints for table `options`
--
ALTER TABLE `options`
  ADD CONSTRAINT `FKfpi72b9um5sejnj31r7292wvy` FOREIGN KEY (`scales_id`) REFERENCES `scales` (`id`),
  ADD CONSTRAINT `options_ibfk_1` FOREIGN KEY (`title_id`) REFERENCES `title` (`id`),
  ADD CONSTRAINT `options_ibfk_2` FOREIGN KEY (`legend_id`) REFERENCES `legend` (`id`);

--
-- Constraints for table `scales`
--
ALTER TABLE `scales`
  ADD CONSTRAINT `scales_ibfk_1` FOREIGN KEY (`options_id`) REFERENCES `options` (`id`);

--
-- Constraints for table `scales_y_axes`
--
ALTER TABLE `scales_y_axes`
  ADD CONSTRAINT `FKae6t911alqg0l4542oo2xccch` FOREIGN KEY (`y_axes_id`) REFERENCES `yaxes` (`id`),
  ADD CONSTRAINT `FKt5liooj3y8b0l4vqs9q5g87o0` FOREIGN KEY (`scales_id`) REFERENCES `scales` (`id`);

--
-- Constraints for table `ticks`
--
ALTER TABLE `ticks`
  ADD CONSTRAINT `ticks_ibfk_1` FOREIGN KEY (`y_axes_id`) REFERENCES `yaxes` (`id`);

--
-- Constraints for table `yaxes`
--
ALTER TABLE `yaxes`
  ADD CONSTRAINT `FK1ccnus33ypmp3e313nhsb338n` FOREIGN KEY (`ticks_id`) REFERENCES `ticks` (`id`),
  ADD CONSTRAINT `yaxes_ibfk_1` FOREIGN KEY (`scales_id`) REFERENCES `scales` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
