-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2024 at 01:14 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `studentviolation`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_stud`
--

CREATE TABLE `tbl_stud` (
  `s_id` int(50) NOT NULL,
  `s_name` varchar(50) NOT NULL,
  `s_section` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_stud`
--

INSERT INTO `tbl_stud` (`s_id`, `s_name`, `s_section`) VALUES
(201, 'james', 'F'),
(202, 'joejoe', 'B'),
(203, 'Ed Lorenz Villarasa', 'B');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users1`
--

CREATE TABLE `tbl_users1` (
  `u_id` int(20) NOT NULL,
  `u_fname` varchar(50) NOT NULL,
  `u_lname` varchar(50) NOT NULL,
  `u_email` varchar(50) NOT NULL,
  `u_username` varchar(50) NOT NULL,
  `u_password` varchar(50) NOT NULL,
  `u_position` varchar(50) NOT NULL,
  `u_program` varchar(50) NOT NULL,
  `u_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_users1`
--

INSERT INTO `tbl_users1` (`u_id`, `u_fname`, `u_lname`, `u_email`, `u_username`, `u_password`, `u_position`, `u_program`, `u_status`) VALUES
(1, 'EdLorenz', 'Villarasa', 'vil@email.com', 'eddy', 'villarasa', 'SAO', 'N/A', 'Active'),
(5, 'Eddy', 'Villarasaa', 'edy@email.com', 'lorenz', 'lorenz0712', 'DEAN', 'BSHM', 'Active'),
(7, 'JanzelBabon', 'Babon', 'janzel@email.com', 'ggaga', 'yuwreyutgsgdf', 'DEAN', 'BSBA', 'Active'),
(9, 'abigail', 'mahelom', 'abi@email.com', 'abigail', 'abigailgwapa', 'DEAN', 'BSIT', 'Active'),
(10, 'Joe Ryan', 'Victorillo', 'asdasd@email.com', 'joeryan', 'ryanryan', 'DEAN', 'BSCRIM', 'Active'),
(11, 'Mike', 'Bustamante', 'mike@email.com', 'miketest', 'mikemike', 'DEAN', 'BEED', 'Active'),
(12, 'wqeadsaw', 'adasd', 'qw', '123ws', 'qwe123123', 'DEAN', 'N/A', 'Pending'),
(13, 'uusgd', 'uqgfs', 'oiuoiyho', 'oihafoih', 'olkishdf123', 'SAO', 'BSTM', 'Active');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_violation`
--

CREATE TABLE `tbl_violation` (
  `id` int(100) NOT NULL,
  `s_id` int(50) NOT NULL,
  `course` varchar(100) NOT NULL,
  `violation` text NOT NULL,
  `sanction` varchar(500) NOT NULL,
  `type` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_violation`
--

INSERT INTO `tbl_violation` (`id`, `s_id`, `course`, `violation`, `sanction`, `type`) VALUES
(8, 201, 'BEED', 'no id', 'first warning', 'Minor Offense'),
(9, 202, 'BSIT', 'no id', '2nd warning', 'Major Offense'),
(10, 201, 'BEED', 'Smoking', '1st offense', 'Major Offense'),
(11, 201, 'BEED', 'qweasd', 'qweasd', 'Minor Offense'),
(12, 201, 'BEED', 'qweas', '213', 'Minor Offense'),
(13, 203, 'BSHM', 'cutting classes', '1st Warning', 'Major Offense');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_stud`
--
ALTER TABLE `tbl_stud`
  ADD PRIMARY KEY (`s_id`);

--
-- Indexes for table `tbl_users1`
--
ALTER TABLE `tbl_users1`
  ADD PRIMARY KEY (`u_id`);

--
-- Indexes for table `tbl_violation`
--
ALTER TABLE `tbl_violation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `s_id` (`s_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_stud`
--
ALTER TABLE `tbl_stud`
  MODIFY `s_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;

--
-- AUTO_INCREMENT for table `tbl_users1`
--
ALTER TABLE `tbl_users1`
  MODIFY `u_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `tbl_violation`
--
ALTER TABLE `tbl_violation`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_violation`
--
ALTER TABLE `tbl_violation`
  ADD CONSTRAINT `tbl_violation_ibfk_1` FOREIGN KEY (`s_id`) REFERENCES `tbl_stud` (`s_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
