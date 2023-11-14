-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 14, 2023 at 02:05 PM
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
  `chartName` varchar(255) DEFAULT NULL,
  `chart_data_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `chartdata`
--

CREATE TABLE `chartdata` (
  `id` bigint(20) NOT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `chartdata`
--

INSERT INTO `chartdata` (`id`, `type`) VALUES
(1, 'scatter'),
(2, 'scatter'),
(3, 'scatter');

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
  `data_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `dataset`
--

INSERT INTO `dataset` (`id`, `pointRadius`, `pointBackgroundColor`, `fill`, `data_id`) VALUES
(1, 4, 'rgba(0,0,255,1)', 0, 1),
(2, 4, 'rgba(0,0,255,1)', 0, 1),
(3, 4, 'rgba(0,0,255,1)', 0, 1);

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
  `legend_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `options`
--

INSERT INTO `options` (`id`, `title_id`, `legend_id`) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 1, 1),
(4, 2, 2),
(5, 1, 1),
(6, 2, 2);

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
-- Table structure for table `ticks`
--

CREATE TABLE `ticks` (
  `id` bigint(20) NOT NULL,
  `min` int(11) DEFAULT NULL,
  `max` int(11) DEFAULT NULL,
  `y_axes_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  `scales_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

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
  ADD PRIMARY KEY (`id`);

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
-- Indexes for table `legend`
--
ALTER TABLE `legend`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `options`
--
ALTER TABLE `options`
  ADD PRIMARY KEY (`id`),
  ADD KEY `title_id` (`title_id`),
  ADD KEY `legend_id` (`legend_id`);

--
-- Indexes for table `scales`
--
ALTER TABLE `scales`
  ADD PRIMARY KEY (`id`),
  ADD KEY `options_id` (`options_id`);

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
  ADD KEY `scales_id` (`scales_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `chart`
--
ALTER TABLE `chart`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

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
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `title`
--
ALTER TABLE `title`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `yaxes`
--
ALTER TABLE `yaxes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `chart`
--
ALTER TABLE `chart`
  ADD CONSTRAINT `chart_ibfk_1` FOREIGN KEY (`chart_data_id`) REFERENCES `chartdata` (`id`);

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
-- Constraints for table `options`
--
ALTER TABLE `options`
  ADD CONSTRAINT `options_ibfk_1` FOREIGN KEY (`title_id`) REFERENCES `title` (`id`),
  ADD CONSTRAINT `options_ibfk_2` FOREIGN KEY (`legend_id`) REFERENCES `legend` (`id`);

--
-- Constraints for table `scales`
--
ALTER TABLE `scales`
  ADD CONSTRAINT `scales_ibfk_1` FOREIGN KEY (`options_id`) REFERENCES `options` (`id`);

--
-- Constraints for table `ticks`
--
ALTER TABLE `ticks`
  ADD CONSTRAINT `ticks_ibfk_1` FOREIGN KEY (`y_axes_id`) REFERENCES `yaxes` (`id`);

--
-- Constraints for table `yaxes`
--
ALTER TABLE `yaxes`
  ADD CONSTRAINT `yaxes_ibfk_1` FOREIGN KEY (`scales_id`) REFERENCES `scales` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
