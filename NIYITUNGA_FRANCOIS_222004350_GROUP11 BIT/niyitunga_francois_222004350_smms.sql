-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 19, 2024 at 08:47 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `niyitunga_francois_222004350_smms`
--

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE `class` (
  `Id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `courses` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`Id`, `name`, `courses`) VALUES
(5, 'Level twomedicine', 'Anatomy'),
(6, 'Level twomedicine', 'physiology'),
(7, 'Level2 medicine', 'embriology'),
(8, 'Level3 architecture', 'earthquake');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `credit` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `name`, `credit`) VALUES
(2, 'YUI', 23),
(3, 'MATHEMATICS', 20),
(4, 'JAVA', 20),
(5, 'MULTIMEDIA', 15),
(6, 'IT', 15),
(7, 'ENGLISH', 20),
(8, 'RT', 2);

-- --------------------------------------------------------

--
-- Table structure for table `hod`
--

CREATE TABLE `hod` (
  `Id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `contact` int(11) NOT NULL,
  `address` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hod`
--

INSERT INTO `hod` (`Id`, `name`, `contact`, `address`) VALUES
(1, 'Dr RUGEMA', 787563486, 'r@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer`
--

CREATE TABLE `lecturer` (
  `Id` int(11) NOT NULL,
  `name` varchar(25) NOT NULL,
  `contact` int(20) NOT NULL,
  `date` datetime(6) NOT NULL,
  `gender` varchar(11) NOT NULL,
  `address` varchar(11) NOT NULL,
  `courseId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer`
--

INSERT INTO `lecturer` (`Id`, `name`, `contact`, `date`, `gender`, `address`, `courseId`) VALUES
(2, 'Dr Gashegu', 781020220, '2022-01-01 00:00:00.000000', 'm', 'ww@gmail.co', 1),
(3, 'Dr Murenzi', 787399760, '1999-01-01 00:00:00.000000', 'M', 'm@gmail.com', 2),
(4, 'Dr Shema', 787399761, '1998-01-01 00:00:00.000000', 'M', 's@gmail.com', 3),
(5, 'Dr Francois', 787399762, '1997-01-01 00:00:00.000000', 'M', 'f@gmail.com', 4);

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `Id` int(11) NOT NULL,
  `courses` varchar(25) NOT NULL,
  `lecturers` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`Id`, `courses`, `lecturers`) VALUES
(1, 'Eartquake', 'Francois'),
(2, 'anatomy', 'Dr Iradukunda'),
(3, 'physiology', 'Dr Emmanuel');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Contact` int(11) NOT NULL,
  `Date` datetime(6) NOT NULL,
  `Gender` varchar(11) NOT NULL,
  `Address` varchar(11) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`Id`, `Name`, `Contact`, `Date`, `Gender`, `Address`, `Password`) VALUES
(2, 'Fabrice', 790746153, '2021-01-01 00:00:00.000000', 'm', 'fb@gmail.co', '112'),
(3, 'Francois', 780658244, '2000-01-01 00:00:00.000000', 'M', 'n@gmail.com', '123'),
(4, ' Salomon', 780658245, '2001-01-01 00:00:00.000000', 'M', 'u@gmail.com', '124'),
(5, ' Divine', 780658246, '2002-01-01 00:00:00.000000', 'F', 'd@gmail.com', '125');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `class`
--
ALTER TABLE `class`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `hod`
--
ALTER TABLE `hod`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `lecturer`
--
ALTER TABLE `lecturer`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `marks`
--
ALTER TABLE `marks`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `class`
--
ALTER TABLE `class`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `hod`
--
ALTER TABLE `hod`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `lecturer`
--
ALTER TABLE `lecturer`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `marks`
--
ALTER TABLE `marks`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
