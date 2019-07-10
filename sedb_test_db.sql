-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 10 juil. 2019 à 11:57
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `sedb`
--

-- --------------------------------------------------------

--
-- Structure de la table `collaboration`
--

DROP TABLE IF EXISTS `collaboration`;
CREATE TABLE IF NOT EXISTS `collaboration` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `publication_id` int(11) DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKphn1hig8qctobpdyifk4ixvbb` (`publication_id`),
  KEY `FKdxxwbbc3drplmeqekvrr77uld` (`student_id`)
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `collaboration`
--

INSERT INTO `collaboration` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `publication_id`, `student_id`) VALUES
(1, NULL, '2006-02-13 07:50:55', NULL, '1990-11-03 00:57:31', 1, 1),
(2, NULL, '1994-01-04 04:13:01', NULL, '2019-03-13 19:44:07', 2, 2),
(3, NULL, '2014-10-18 14:19:33', NULL, '1988-03-06 22:37:09', 3, 3),
(4, NULL, '2001-10-12 21:24:25', NULL, '1984-07-21 02:58:12', 4, 4),
(5, NULL, '1996-04-12 19:54:35', NULL, '1977-09-30 16:31:41', 5, 5),
(6, NULL, '1984-04-26 14:44:43', NULL, '1984-10-22 22:35:46', 6, 6),
(7, NULL, '1980-03-21 03:36:13', NULL, '1980-11-02 11:31:11', 7, 7),
(8, NULL, '1980-06-13 07:24:04', NULL, '1982-09-28 02:32:18', 8, 8),
(9, NULL, '2010-08-16 20:20:34', NULL, '1979-11-10 19:08:25', 9, 9),
(10, NULL, '2011-10-16 11:35:09', NULL, '1983-05-03 13:57:22', 10, 10),
(11, NULL, '1998-01-13 08:04:07', NULL, '2015-12-04 08:26:22', 11, 11),
(12, NULL, '1972-04-05 21:22:42', NULL, '1970-03-12 19:25:48', 12, 12),
(13, NULL, '1980-07-18 12:56:28', NULL, '2007-12-12 10:27:50', 13, 13),
(14, NULL, '1978-08-27 22:30:14', NULL, '1988-06-16 17:37:04', 14, 14),
(15, NULL, '2018-04-30 20:25:58', NULL, '1984-01-22 08:54:20', 15, 15),
(16, NULL, '2002-07-31 17:20:13', NULL, '1984-01-12 05:30:09', 16, 16),
(17, NULL, '1971-11-01 05:00:48', NULL, '2001-12-15 14:15:31', 17, 17),
(18, NULL, '2003-12-25 01:28:40', NULL, '1973-03-21 21:52:28', 18, 18),
(19, NULL, '1986-05-29 19:23:53', NULL, '2014-03-10 04:41:24', 19, 19),
(20, NULL, '1982-07-27 16:48:42', NULL, '2015-04-01 15:03:56', 20, 20),
(21, NULL, '1993-06-01 05:57:49', NULL, '1980-02-16 19:04:08', 21, 21),
(22, NULL, '1973-10-06 04:58:24', NULL, '2003-09-23 18:19:57', 22, 22),
(23, NULL, '1984-03-06 09:37:28', NULL, '1984-10-17 23:07:43', 23, 23),
(24, NULL, '2011-04-23 07:34:13', NULL, '1988-06-01 09:43:09', 24, 24),
(25, NULL, '2007-04-24 13:38:50', NULL, '1997-08-28 12:49:59', 25, 25),
(26, NULL, '2011-11-26 13:38:13', NULL, '2015-09-23 01:09:52', 26, 1),
(27, NULL, '2011-08-24 03:57:00', NULL, '1976-08-22 11:26:38', 27, 2),
(28, NULL, '1982-08-16 05:37:25', NULL, '1980-04-05 06:00:46', 28, 3),
(29, NULL, '1978-03-31 19:55:42', NULL, '2002-03-10 01:43:32', 29, 4),
(30, NULL, '1985-07-01 17:20:07', NULL, '1996-08-11 07:21:24', 30, 5),
(31, NULL, '2011-03-21 06:09:22', NULL, '1978-05-01 00:52:34', 31, 6),
(32, NULL, '2017-05-30 12:32:00', NULL, '1993-11-27 18:54:31', 32, 7),
(33, NULL, '2018-02-12 17:26:27', NULL, '1980-01-21 01:02:08', 33, 8),
(34, NULL, '1970-09-18 12:50:11', NULL, '2019-04-21 12:10:25', 34, 9),
(35, NULL, '1985-10-21 16:59:53', NULL, '2013-11-10 23:17:43', 35, 10),
(36, NULL, '2001-10-31 09:18:50', NULL, '2016-12-20 21:55:08', 36, 11),
(37, NULL, '1973-07-09 12:00:21', NULL, '2012-04-27 12:51:59', 37, 12),
(38, NULL, '1977-06-06 15:02:22', NULL, '2003-02-04 09:29:58', 38, 13),
(39, NULL, '1980-06-30 04:31:37', NULL, '2010-11-25 09:05:02', 39, 14),
(40, NULL, '2019-01-30 00:31:46', NULL, '1985-03-02 23:17:20', 40, 15),
(41, NULL, '2003-04-20 19:41:53', NULL, '2001-09-21 23:42:22', 41, 16),
(42, NULL, '1972-09-07 00:55:06', NULL, '1980-12-26 00:11:52', 42, 17),
(43, NULL, '2009-08-02 18:51:59', NULL, '2009-06-21 16:30:15', 43, 18),
(44, NULL, '1975-12-27 13:06:50', NULL, '1977-06-10 19:25:19', 44, 19),
(45, NULL, '1995-12-23 18:06:16', NULL, '1990-12-08 13:04:57', 45, 20),
(46, NULL, '2001-06-15 14:37:58', NULL, '1973-09-13 13:50:40', 46, 21),
(47, NULL, '2010-08-13 15:25:27', NULL, '1970-10-13 09:02:17', 47, 22),
(48, NULL, '1987-09-25 18:09:58', NULL, '2010-08-27 16:57:14', 48, 23),
(49, NULL, '1997-06-20 05:14:05', NULL, '1986-07-25 22:46:46', 49, 24),
(50, NULL, '2008-11-10 06:39:20', NULL, '2001-03-04 13:49:48', 50, 25),
(51, NULL, '1995-06-05 10:48:52', NULL, '2008-06-28 03:22:45', 51, 1),
(52, NULL, '1991-07-02 19:56:01', NULL, '1990-10-13 05:36:15', 52, 2),
(53, NULL, '1988-05-01 05:13:52', NULL, '2015-11-16 22:02:35', 53, 3),
(54, NULL, '2016-07-14 02:06:06', NULL, '2005-03-05 05:35:01', 54, 4),
(55, NULL, '1971-07-10 05:45:31', NULL, '1993-07-21 02:00:36', 55, 5),
(56, NULL, '1999-10-31 20:50:56', NULL, '2002-06-21 11:20:21', 56, 6),
(57, NULL, '1986-06-17 18:36:05', NULL, '2017-03-14 05:26:51', 57, 7),
(58, NULL, '2015-03-08 18:55:58', NULL, '2015-10-15 08:54:17', 58, 8),
(59, NULL, '1979-08-04 03:53:21', NULL, '2013-06-17 00:17:00', 59, 9),
(60, NULL, '1985-02-25 23:48:07', NULL, '1983-01-08 15:05:03', 60, 10),
(61, NULL, '1974-12-22 04:53:58', NULL, '2004-06-17 15:16:50', 61, 11),
(62, NULL, '2016-03-01 18:08:55', NULL, '1970-06-22 14:07:43', 62, 12),
(63, NULL, '2012-02-09 06:15:56', NULL, '1987-11-06 08:54:47', 63, 13),
(64, NULL, '1977-09-05 12:56:07', NULL, '2003-09-21 21:52:09', 64, 14),
(65, NULL, '2011-04-25 01:31:16', NULL, '1994-03-26 05:51:59', 65, 15),
(66, NULL, '1990-08-29 01:32:54', NULL, '2003-02-21 23:53:50', 66, 16),
(67, NULL, '1972-12-21 04:25:07', NULL, '2016-12-26 06:21:28', 67, 17),
(68, NULL, '2006-10-30 10:39:06', NULL, '2001-12-19 11:03:31', 68, 18),
(69, NULL, '2003-09-03 02:38:01', NULL, '1984-08-03 06:24:39', 69, 19),
(70, NULL, '2000-09-16 10:03:14', NULL, '1974-05-19 15:48:14', 70, 20),
(71, NULL, '1997-06-29 09:15:20', NULL, '1991-01-14 16:51:20', 71, 21),
(72, NULL, '2016-06-20 19:42:31', NULL, '1972-03-25 04:26:56', 72, 22),
(73, NULL, '2009-10-27 16:10:00', NULL, '1980-04-27 21:32:22', 73, 23),
(74, NULL, '1980-01-25 14:34:12', NULL, '1973-06-03 02:07:03', 74, 24),
(75, NULL, '1977-10-01 06:26:49', NULL, '1984-03-11 16:14:21', 75, 25),
(76, NULL, '1993-11-18 10:41:05', NULL, '1978-11-16 23:46:15', 76, 1),
(77, NULL, '2009-10-06 01:12:55', NULL, '1980-07-23 08:27:13', 77, 2),
(78, NULL, '1978-05-13 05:27:48', NULL, '1980-07-24 14:21:19', 78, 3),
(79, NULL, '1980-10-28 08:52:17', NULL, '2001-11-07 07:36:02', 79, 4),
(80, NULL, '2016-06-24 17:02:02', NULL, '2008-02-28 12:16:27', 80, 5),
(81, NULL, '2002-02-12 07:34:09', NULL, '1993-06-28 20:25:15', 81, 6),
(82, NULL, '1974-12-13 22:55:11', NULL, '2015-12-16 05:48:52', 82, 7),
(83, NULL, '2003-02-15 22:51:44', NULL, '1990-08-14 05:49:58', 83, 8),
(84, NULL, '2005-05-07 12:46:35', NULL, '2007-01-08 11:56:38', 84, 9),
(85, NULL, '2007-09-15 16:45:34', NULL, '1989-10-08 12:15:07', 85, 10),
(86, NULL, '2011-07-03 21:57:36', NULL, '2011-01-16 01:05:22', 86, 11),
(87, NULL, '1973-10-06 05:49:52', NULL, '1975-07-18 04:33:31', 87, 12),
(88, NULL, '1998-10-20 23:58:44', NULL, '1989-08-17 16:38:50', 88, 13),
(89, NULL, '2001-11-18 11:37:33', NULL, '1973-01-01 17:00:26', 89, 14),
(90, NULL, '2012-07-04 07:33:42', NULL, '1983-07-03 22:53:43', 90, 15),
(91, NULL, '2005-02-05 07:57:29', NULL, '1977-08-14 21:41:27', 91, 16),
(92, NULL, '1992-04-11 19:03:49', NULL, '1993-11-30 14:58:08', 92, 17),
(93, NULL, '1985-08-20 12:40:16', NULL, '2013-04-13 07:21:08', 93, 18),
(94, NULL, '1980-12-31 02:38:09', NULL, '1980-08-15 04:54:56', 94, 19),
(95, NULL, '2010-03-12 06:39:14', NULL, '1992-03-26 18:42:47', 95, 20),
(96, NULL, '1980-10-29 16:17:24', NULL, '1987-01-20 20:05:12', 96, 21),
(97, NULL, '1985-06-01 08:22:18', NULL, '2013-12-09 22:20:11', 97, 22),
(98, NULL, '1975-10-14 17:28:04', NULL, '2005-04-11 21:03:47', 98, 23),
(99, NULL, '2017-07-20 04:49:01', NULL, '2008-04-18 06:41:24', 99, 24),
(100, NULL, '1989-07-12 20:26:01', NULL, '2009-11-02 10:32:28', 100, 25);

-- --------------------------------------------------------

--
-- Structure de la table `department`
--

DROP TABLE IF EXISTS `department`;
CREATE TABLE IF NOT EXISTS `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `department`
--

INSERT INTO `department` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `name`) VALUES
(1, NULL, '2010-03-29 16:34:37', NULL, '1976-09-16 07:49:45', 'quia'),
(2, NULL, '2002-10-26 18:25:46', NULL, '2014-10-03 03:55:17', 'aut'),
(3, NULL, '1983-05-28 22:43:04', NULL, '1995-04-01 05:10:16', 'soluta');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Structure de la table `keyword`
--

DROP TABLE IF EXISTS `keyword`;
CREATE TABLE IF NOT EXISTS `keyword` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `value` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `keyword`
--

INSERT INTO `keyword` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `value`) VALUES
(1, NULL, '1971-08-20 14:22:18', NULL, '2013-11-27 18:08:24', 'id'),
(2, NULL, '1998-04-03 07:58:27', NULL, '1972-07-17 14:25:05', 'aliquam'),
(3, NULL, '1977-12-02 05:31:17', NULL, '1997-07-20 03:32:32', 'vel'),
(4, NULL, '1992-06-18 17:56:39', NULL, '2005-04-06 04:09:52', 'cupiditate'),
(5, NULL, '1980-09-14 21:06:32', NULL, '1977-02-23 11:28:24', 'tempore'),
(6, NULL, '1997-01-23 10:09:17', NULL, '2000-04-17 23:29:04', 'aspernatur'),
(7, NULL, '1994-06-28 11:49:19', NULL, '2007-05-16 07:58:07', 'a'),
(8, NULL, '1985-05-27 23:16:16', NULL, '1994-10-11 06:28:32', 'facere'),
(9, NULL, '1991-01-15 15:15:15', NULL, '1972-01-05 15:17:06', 'ut'),
(10, NULL, '1975-09-06 04:06:00', NULL, '2011-10-24 16:42:25', 'sit');

-- --------------------------------------------------------

--
-- Structure de la table `organisation`
--

DROP TABLE IF EXISTS `organisation`;
CREATE TABLE IF NOT EXISTS `organisation` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `adress` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `tel` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `website` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `organisation`
--

INSERT INTO `organisation` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `adress`, `email`, `name`, `tel`, `website`) VALUES
(1, NULL, '2009-08-22 06:43:55', NULL, '1979-03-30 05:23:22', '4019 Clarissa Station', 'prince44@example.net', 'omnis', '06501468330', 'http://williamson.com/'),
(2, NULL, '2004-08-03 23:54:21', NULL, '2014-05-01 20:24:27', '55803 Wilford Falls Apt. 702', 'easter.leannon@example.org', 'dolor', '1-954-609-6565x2446', 'http://www.sawayn.org/'),
(3, NULL, '1984-01-10 08:34:48', NULL, '1986-05-18 13:55:10', '124 Fermin Island Suite 810', 'qpagac@example.org', 'voluptas', '05648236058', 'http://www.raynor.com/'),
(4, NULL, '1976-09-20 14:37:40', NULL, '1982-01-25 08:13:50', '096 Dare Wall Apt. 130', 'america.stoltenberg@example.org', 'fugit', '833-711-2590x26624', 'http://www.tremblay.biz/'),
(5, NULL, '2005-09-10 16:51:29', NULL, '1988-01-07 03:59:28', '981 Rempel Hill', 'runolfsson.jedediah@example.org', 'id', '782-544-3524x14476', 'http://www.wuckertreichel.com/'),
(6, NULL, '2001-10-11 18:58:30', NULL, '1983-10-11 12:10:13', '8030 Yoshiko Mission', 'considine.kitty@example.org', 'possimus', '(313)118-5856x81545', 'http://www.nader.biz/'),
(7, NULL, '2017-03-10 10:44:20', NULL, '1986-06-20 08:51:55', '719 Anika Manor Suite 557', 'bailee.schaefer@example.net', 'ut', '1-150-634-7409', 'http://johnston.info/'),
(8, NULL, '1980-11-02 10:34:03', NULL, '2008-09-26 18:17:30', '6852 Jerde Inlet', 'claudie01@example.com', 'cum', '645.954.1354', 'http://jaskolskikuhlman.com/'),
(9, NULL, '2008-04-23 19:22:06', NULL, '1991-11-20 01:27:04', '256 Watsica Landing', 'pbruen@example.org', 'occaecati', '(908)372-3928x96746', 'http://daniel.net/'),
(10, NULL, '1977-03-18 17:04:17', NULL, '2017-02-17 12:19:03', '93379 Gottlieb Curve Suite 360', 'bjones@example.com', 'ut', '(515)879-3670', 'http://mante.com/');

-- --------------------------------------------------------

--
-- Structure de la table `organisation_department`
--

DROP TABLE IF EXISTS `organisation_department`;
CREATE TABLE IF NOT EXISTS `organisation_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  `organisation_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK74i31jckkfweu37qsx1g2cohp` (`department_id`),
  KEY `FK16yxne9rs8s7gwvoy19vye3i3` (`organisation_id`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `organisation_department`
--

INSERT INTO `organisation_department` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `department_id`, `organisation_id`) VALUES
(2, NULL, '1995-12-22 22:37:09', NULL, '2007-05-18 00:19:38', 2, 2),
(1, NULL, '1970-08-07 14:06:59', NULL, '2010-07-23 00:14:54', 1, 1),
(3, NULL, '2015-07-31 05:24:21', NULL, '1978-06-20 01:27:55', 3, 3),
(4, NULL, '2019-04-29 03:04:23', NULL, '2010-08-14 07:11:08', 1, 4),
(5, NULL, '2019-06-20 13:17:14', NULL, '2003-05-18 13:11:29', 2, 5),
(6, NULL, '2013-06-19 14:50:36', NULL, '2005-08-28 23:06:44', 3, 6),
(7, NULL, '1982-04-22 22:13:36', NULL, '2016-03-29 16:00:06', 1, 7),
(8, NULL, '1985-05-12 22:40:15', NULL, '1970-06-17 04:17:30', 2, 8),
(9, NULL, '2010-08-11 00:50:19', NULL, '2003-05-06 09:28:43', 3, 9),
(10, NULL, '2017-09-13 23:35:16', NULL, '1978-08-01 02:57:06', 1, 10),
(11, NULL, '1976-12-25 21:48:57', NULL, '2001-01-02 21:40:43', 2, 1),
(12, NULL, '1990-11-03 21:19:33', NULL, '2008-07-03 03:41:43', 3, 2),
(13, NULL, '2017-07-30 09:30:17', NULL, '1997-07-21 20:14:07', 1, 3),
(14, NULL, '1971-11-15 11:13:58', NULL, '2009-03-21 11:35:51', 2, 4),
(15, NULL, '1994-10-03 09:38:40', NULL, '1987-02-01 02:39:59', 3, 5);

-- --------------------------------------------------------

--
-- Structure de la table `person`
--

DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `dtype` varchar(31) COLLATE utf8_bin NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `birth_date` datetime DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `gendre` char(1) COLLATE utf8_bin NOT NULL,
  `is_active` bit(1) NOT NULL,
  `is_valide` bit(1) NOT NULL,
  `last_name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `role` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `diploma` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `level` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `grade` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `department_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKqqg5cmjglivmepn16lqb1m8ux` (`department_id`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `person`
--

INSERT INTO `person` (`dtype`, `id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `birth_date`, `email`, `first_name`, `gendre`, `is_active`, `is_valide`, `last_name`, `password`, `salary`, `role`, `diploma`, `level`, `grade`, `department_id`) VALUES
('Student', 1, NULL, '1976-07-21 00:28:33', NULL, '1992-05-05 05:16:14', '2017-01-07 07:05:34', 'zgulgowski@example.com', 'Andre', 'P', b'1', b'1', 'Towne', '1cdcd3dca87250b39254538da6e79ed35fce16b0', 0, 'X', NULL, 'd', 's', 1),
('Student', 2, NULL, '2014-11-23 15:39:51', NULL, '1976-05-20 21:45:00', '2007-07-24 17:36:59', 'lshields@example.com', 'Charley', 'M', b'1', b'1', 'Bogan', '3096e21ea5fffc5b66614a2abfdf433acf66575e', 0, 'X', NULL, 'w', 'y', 2),
('Student', 3, NULL, '1975-11-29 21:09:10', NULL, '2007-10-03 11:41:27', '1994-08-28 09:35:45', 'rice.janelle@example.org', 'Nedra', 'M', b'1', b'1', 'Lehner', 'a8dfb2f50ab82c0defb5eda5ebd1ea47a7a74b46', 0, 'X', NULL, 'y', 'n', 3),
('Student', 4, NULL, '2012-11-30 02:59:20', NULL, '2004-06-10 08:17:30', '1972-11-10 10:40:20', 'dharber@example.com', 'Abby', 'M', b'1', b'1', 'Borer', '4f3d8e4382306ff6608fc957b3afd22c0da575e5', 0, 'X', NULL, 'p', 'd', 1),
('Student', 5, NULL, '1996-10-12 12:49:43', NULL, '2009-05-27 00:46:49', '1976-10-28 05:32:33', 'fpagac@example.org', 'Gene', 'P', b'1', b'1', 'Dooley', '34569e3945a7a9678f8f006f67fd0ba3c27042d8', 0, 'X', NULL, 'r', 'f', 2),
('Student', 6, NULL, '1981-11-15 05:48:37', NULL, '1997-10-16 02:37:14', '2000-12-31 20:24:44', 'nbeer@example.com', 'Jacinthe', 'D', b'1', b'1', 'Aufderhar', 'e0dbeeae54d6b958ef0101b6f0c7301ce5757a70', 0, 'X', NULL, 'v', 's', 3),
('Student', 7, NULL, '1976-04-04 16:14:44', NULL, '1985-03-22 15:13:51', '1984-04-24 18:50:00', 'mark.o\'conner@example.net', 'Bulah', 'D', b'1', b'1', 'Swaniawski', 'dde4818fe308ac8b2c55e9c4281baae3f7b12d11', 0, 'X', NULL, 'g', 'p', 1),
('Student', 8, NULL, '1980-02-13 02:44:38', NULL, '2012-04-03 11:53:41', '2014-07-17 06:39:06', 'adalberto.grant@example.org', 'Rosina', 'P', b'1', b'1', 'Corkery', '7f104a2fba55cf08aed93595da31f71eca7d085b', 0, 'X', NULL, 'f', 'y', 2),
('Student', 9, NULL, '2007-02-19 14:09:13', NULL, '2003-07-11 12:18:34', '1976-11-05 22:45:44', 'jazmyne53@example.org', 'Simeon', 'P', b'1', b'1', 'Lind', '84d3335aee05c4faed56ca8b28bec8365cbf16eb', 0, 'X', NULL, 'v', 'u', 3),
('professor', 10, NULL, '2008-07-13 12:43:11', NULL, '1985-01-06 08:48:53', '2001-10-21 04:31:32', 'brandt41@example.org', 'Mortimer', 'M', b'1', b'1', 'Balistreri', '18b6d5f9c28138d595ca0500d8914bee12b2fd53', 0, 'X', NULL, 'f', 'c', 1),
('Student', 11, NULL, '2002-10-26 02:51:15', NULL, '2018-11-02 15:25:42', '2000-11-16 01:24:20', 'lwelch@example.net', 'Franco', 'P', b'1', b'1', 'Predovic', 'a473e0834d68437d24bf61e3ab961f7fac8f31a5', 0, 'X', NULL, 'o', 'g', 2),
('Student', 12, NULL, '2019-04-29 07:36:00', NULL, '1975-05-21 08:53:02', '1987-06-26 07:18:46', 'amelie.langosh@example.org', 'Kathlyn', 'D', b'1', b'1', 'Hamill', 'bfa2f83dfc6cc568dd8ae725c777038020ceabdb', 0, 'X', NULL, 'e', 'e', 3),
('professor', 13, NULL, '1982-03-22 04:14:24', NULL, '2011-07-26 01:53:27', '1986-03-21 10:27:50', 'philip46@example.org', 'Clark', 'D', b'1', b'1', 'Casper', 'd67ca4f6a88ca2e9ec52c49adb22cbb4767ea30d', 0, 'X', NULL, 'j', 'z', 1),
('Student', 14, NULL, '2011-11-26 17:28:46', NULL, '2000-05-14 01:07:02', '2001-07-08 17:29:34', 'laurianne.dietrich@example.com', 'Reba', 'D', b'1', b'1', 'Bernier', '892ff5a4e8301f34c094f83ebfa8ebe5cbf1730b', 0, 'X', NULL, 'k', 'g', 2),
('Student', 15, NULL, '2001-07-18 11:59:03', NULL, '1991-08-30 10:01:43', '1997-05-07 08:56:02', 'zbalistreri@example.net', 'Rafaela', 'D', b'1', b'1', 'Price', 'b5506f6debd1d8078bd97a08fac137a8b1ed4ac3', 0, 'X', NULL, 's', 'j', 3),
('Student', 16, NULL, '1984-05-08 12:03:17', NULL, '2007-12-02 19:06:14', '2012-07-30 06:15:15', 'pablo83@example.com', 'Arianna', 'D', b'1', b'1', 'Crooks', '5cad46dfba6df2ba1d64f4c6ac41a1fc9dacb604', 0, 'X', NULL, 'j', 'l', 1),
('Student', 17, NULL, '2014-12-23 10:04:57', NULL, '2014-06-04 00:36:31', '1996-09-05 08:20:20', 'kiley.harber@example.org', 'Leonard', 'D', b'1', b'1', 'Quigley', 'be90554da9828bc99f8abe4201922ee494ce6b5d', 0, 'X', NULL, 'j', 'e', 2),
('Student', 18, NULL, '1971-08-04 12:10:40', NULL, '1977-03-22 04:41:30', '1995-03-13 15:26:36', 'mhaley@example.org', 'Luis', 'D', b'1', b'1', 'Koch', '46b0b69cfdf1aa82eabc12cd5b5934d78314c0e2', 0, 'X', NULL, 'q', 'o', 3),
('Student', 19, NULL, '2006-05-15 22:07:37', NULL, '1994-09-29 23:36:57', '1995-01-26 07:24:22', 'zjacobs@example.org', 'Giles', 'P', b'1', b'1', 'Cole', '7e0c5cc254dff3e2088ff5599aaab3ca2c017b88', 0, 'X', NULL, 'g', 'g', 1),
('Student', 20, NULL, '2009-07-09 02:48:22', NULL, '2011-12-19 10:21:09', '1976-08-21 11:07:18', 'lilian20@example.com', 'Javon', 'M', b'1', b'1', 'Prohaska', '6044eb5ad10eea176bb09360ecf8dddd417cb1b2', 0, 'X', NULL, 'p', 'c', 2),
('Student', 21, NULL, '2014-06-22 15:17:24', NULL, '2000-06-14 20:46:17', '1975-12-11 02:10:48', 'rolson@example.net', 'Jaylon', 'M', b'1', b'1', 'Stroman', 'f99ce53fff099bdac0734652be078fabfb28df81', 0, 'X', NULL, 'p', 'k', 3),
('Student', 22, NULL, '2010-01-24 16:32:20', NULL, '1982-06-13 19:13:20', '2016-02-23 08:11:34', 'kuphal.kallie@example.org', 'Garland', 'P', b'1', b'1', 'Walker', '76e7b6d3c3c025a5ac78c08dfa499dba3d89312e', 0, 'X', NULL, 'f', 'l', 1),
('Student', 23, NULL, '2008-05-16 18:16:23', NULL, '1988-09-14 02:14:55', '1981-12-06 00:46:14', 'howe.marcus@example.org', 'Morton', 'M', b'1', b'1', 'Stiedemann', '58dd47bc1b646451940ab4944196b38b66be91ae', 0, 'X', NULL, 'j', 'b', 2),
('Student', 24, NULL, '2009-02-25 20:02:35', NULL, '1977-09-26 16:19:52', '1978-02-06 01:54:09', 'whermann@example.net', 'Kelsie', 'M', b'1', b'1', 'Kris', '2849f2f986a7460745d50501536df020db1058d2', 0, 'X', NULL, 'm', 'n', 3),
('Student', 25, NULL, '2002-04-25 09:30:16', NULL, '1983-05-08 12:15:25', '2013-07-23 16:12:18', 'feil.wilhelm@example.net', 'Estrella', 'M', b'1', b'1', 'Bosco', '88f981bb42690ea60bd3c17216ee0359ca221edf', 0, 'X', NULL, 'f', 'j', 1);

-- --------------------------------------------------------

--
-- Structure de la table `publication`
--

DROP TABLE IF EXISTS `publication`;
CREATE TABLE IF NOT EXISTS `publication` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `end` datetime DEFAULT NULL,
  `final_version` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `is_published` bit(1) NOT NULL,
  `abstract` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `start` datetime DEFAULT NULL,
  `title` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `student_id` int(11) DEFAULT NULL,
  `state_id` int(11) DEFAULT NULL,
  `supervisor_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfp3yc4n32s198ofwtxye185y4` (`student_id`),
  KEY `FKsv0ic0a99slo5tk4dk8rd3lmt` (`state_id`),
  KEY `FKmfaxumlo044007s6efuq26r1d` (`supervisor_id`)
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `publication`
--

INSERT INTO `publication` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `end`, `final_version`, `is_published`, `abstract`, `start`, `title`, `student_id`, `state_id`, `supervisor_id`) VALUES
(1, NULL, '2014-01-17 16:00:16', NULL, '2012-01-05 13:22:29', '1970-12-24 07:54:34', NULL, b'1', 'Occaecati aspernatur explicabo debitis modi delectus reprehenderit. Quidem id qui et consequatur numquam. Amet dolores esse omnis a. Magnam ut consequatur molestias et aliquam accusantium.', '1999-07-25 08:50:58', 'Sint et dolores eligendi et beatae quaerat et.', 1, 1, 10),
(2, NULL, '1998-11-23 06:13:42', NULL, '1970-03-31 04:52:38', '1997-12-16 21:43:45', NULL, b'1', 'Qui cum officiis dignissimos et ab qui eum facere. Repellat consectetur autem maxime rerum veritatis repellendus est. Eaque odio et corrupti est et tenetur.', '1974-08-09 15:22:59', 'Facere ut ducimus ab blanditiis fugiat aut sunt consequatur.', 1, 2, 10),
(3, NULL, '1981-09-16 12:42:00', NULL, '1992-09-08 10:42:39', '2004-06-26 01:30:08', NULL, b'1', 'Nihil laudantium necessitatibus ab dignissimos. Consequuntur deserunt et consequuntur nihil. Voluptatem voluptates voluptatum voluptatibus aut excepturi. Ex sit dolore quo qui est facilis.', '2004-03-23 21:17:21', 'Animi veniam voluptatem quam.', 1, 3, 10),
(4, NULL, '1986-07-26 23:27:49', NULL, '1981-12-08 02:32:38', '2007-11-13 19:18:21', NULL, b'1', 'Nesciunt quas ea vel voluptatibus dolorem vero. Quos debitis reprehenderit sit id dignissimos perferendis sit.', '2006-07-18 01:39:21', 'Est eligendi nobis nihil est et dolorum.', 1, 4, 10),
(5, NULL, '1982-12-23 00:29:16', NULL, '1981-06-11 18:45:45', '1985-08-03 10:20:52', NULL, b'1', 'Dolorem facere porro repudiandae voluptate assumenda quisquam. Voluptatum aut placeat voluptatem velit omnis. Nemo voluptas fuga et omnis. Culpa ea consequatur magni qui alias asperiores quia.', '2013-09-17 00:41:08', 'Et et totam atque aut odio.', 5, 1, 10),
(6, NULL, '1984-07-23 17:34:46', NULL, '1992-02-20 05:38:22', '1993-05-15 23:17:30', NULL, b'1', 'Rerum aut nihil aspernatur et. Ratione autem rerum enim quas porro corrupti ullam dolor. Illo natus ut aspernatur nisi.', '1971-08-04 06:37:38', 'Iure rem natus pariatur deleniti sed enim.', 6, 2, 10),
(7, NULL, '1993-10-27 21:44:39', NULL, '1999-04-04 23:44:19', '1987-04-24 23:55:41', NULL, b'1', 'Eius a earum saepe possimus ducimus. Quas non voluptates iure illo et et minima. Odio totam et occaecati optio. Aut at et ad est cum maiores quidem.', '1976-03-04 14:36:49', 'Temporibus at ut ut ipsa qui doloribus.', 7, 3, 10),
(8, NULL, '1975-04-06 11:32:02', NULL, '1973-09-08 09:25:18', '2002-09-08 16:39:16', NULL, b'1', 'Quae laboriosam beatae perferendis et incidunt voluptatem. Nisi molestiae consequuntur et dolorem totam.', '1992-12-30 17:47:12', 'Corporis corporis eos odit.', 8, 4, 10),
(9, NULL, '2000-10-03 18:19:44', NULL, '2012-04-01 08:32:36', '1993-10-14 04:32:08', NULL, b'1', 'Facere vel omnis id id. Dolorum sed maxime voluptatibus nesciunt. Voluptates facilis sed porro. Voluptatibus reiciendis quo neque sit repudiandae.', '2003-11-21 10:45:24', 'Omnis reprehenderit eos voluptatibus dolore.', 9, 1, 10),
(11, NULL, '2011-05-23 06:06:07', NULL, '1980-04-05 21:47:38', '1987-10-29 10:16:36', NULL, b'1', 'Quaerat quas non saepe. Voluptates voluptate nam facere ex magni odit. Adipisci sequi debitis numquam velit velit molestias minima.', '2014-03-20 06:46:39', 'In aut dolore repellat modi et.', 11, 3, 13),
(12, NULL, '2013-06-30 01:25:43', NULL, '1990-11-18 04:45:33', '2013-01-28 11:04:58', NULL, b'1', 'Nisi est amet fugiat. Et eos nostrum maxime repellendus. Doloremque praesentium dolorum sapiente in ut veniam.', '2013-01-05 19:39:20', 'Quisquam hic nisi nihil nobis fugiat aut.', 12, 4, 13),
(14, NULL, '1971-09-12 16:19:01', NULL, '1997-12-25 15:33:37', '2003-06-01 10:02:57', NULL, b'1', 'Totam eveniet provident eius ipsum qui quia vel. Excepturi eos qui enim sit atque. Sunt dolorum dolorum non consequatur quis fugit corporis quas. Dolores quia aut quis officia est minus.', '2002-12-02 13:13:22', 'Delectus maiores nam repudiandae eius rem voluptatem officiis et.', 14, 2, 13),
(15, NULL, '1992-09-18 19:04:39', NULL, '1979-02-11 04:24:02', '2012-07-24 04:26:34', NULL, b'1', 'Molestiae et blanditiis possimus earum molestiae iusto. Sed sint et hic eos aspernatur accusantium. Neque repellendus aut fugit. Aliquam qui ut qui atque et beatae provident.', '1998-04-16 08:19:09', 'Vel dolores quos nobis consequuntur et sit.', 15, 3, 13),
(16, NULL, '2001-10-11 02:13:30', NULL, '2008-05-14 16:39:24', '1977-07-11 17:19:13', NULL, b'1', 'Sunt eos maiores a iste natus excepturi. Quisquam nisi sed magni. Est suscipit eaque enim commodi est assumenda nemo.', '1992-11-14 14:58:22', 'Voluptatem nam qui laboriosam maiores totam.', 16, 4, 13),
(17, NULL, '2006-11-07 09:16:10', NULL, '1999-09-17 00:04:41', '1988-04-25 07:13:57', NULL, b'1', 'Quasi itaque eos modi et mollitia consequuntur. Provident adipisci sunt pariatur natus. Delectus non sequi natus quidem.', '1997-01-20 10:16:36', 'Dolor itaque nihil sint nam error.', 17, 1, 13),
(18, NULL, '1997-05-24 12:20:32', NULL, '1982-12-15 20:12:45', '1992-12-02 01:11:06', NULL, b'1', 'Maiores fuga quia tempore non doloremque. Suscipit et at eos enim et deleniti et. Consequatur aut rerum dicta ratione.', '1994-07-23 02:29:06', 'Est sed non esse ipsum recusandae corrupti asperiores ut.', 18, 2, 13),
(19, NULL, '2018-04-06 10:03:00', NULL, '2001-05-17 14:37:42', '1984-06-27 21:24:38', NULL, b'1', 'Quia quia minus iste. Dolore est expedita non esse. Dolores dolorem maiores voluptatem tenetur quisquam quia nam aut. Molestiae eos eos animi deserunt numquam recusandae.', '1984-12-24 04:50:38', 'Ut nemo quae debitis.', 19, 3, 13),
(20, NULL, '1985-09-08 07:48:07', NULL, '1973-05-02 06:22:54', '1986-02-18 12:51:23', NULL, b'1', 'Nulla ullam vel sed necessitatibus. Ullam repellendus veritatis eveniet iusto inventore nihil.', '2004-08-25 15:18:17', 'Sed accusantium architecto necessitatibus impedit eligendi.', 20, 4, 13);

-- --------------------------------------------------------

--
-- Structure de la table `publication_keyword`
--

DROP TABLE IF EXISTS `publication_keyword`;
CREATE TABLE IF NOT EXISTS `publication_keyword` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `keyword_id` int(11) DEFAULT NULL,
  `publication_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5oraemstblqt0dsdyyaw3wsgm` (`keyword_id`),
  KEY `FK6j11uad3xq6dxd6ckxec1qd0k` (`publication_id`)
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `publication_keyword`
--

INSERT INTO `publication_keyword` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `keyword_id`, `publication_id`) VALUES
(1, NULL, '2013-12-08 09:05:25', NULL, '2012-04-30 00:46:51', 1, 1),
(2, NULL, '1989-03-03 06:38:26', NULL, '2012-10-26 10:58:15', 2, 2),
(3, NULL, '1992-11-07 19:21:43', NULL, '1993-06-23 13:23:39', 3, 3),
(4, NULL, '1997-07-06 21:31:39', NULL, '1999-08-06 14:14:08', 4, 4),
(5, NULL, '1996-06-22 11:36:23', NULL, '2009-10-10 20:21:45', 5, 5),
(6, NULL, '2019-01-25 14:27:28', NULL, '2008-07-04 15:36:41', 6, 6),
(7, NULL, '1979-03-01 20:23:32', NULL, '1984-01-31 12:39:15', 7, 7),
(8, NULL, '1982-02-26 23:50:45', NULL, '2014-09-02 17:31:38', 8, 8),
(9, NULL, '2018-12-08 02:29:10', NULL, '1979-06-29 23:07:34', 9, 9),
(10, NULL, '2009-07-20 03:23:14', NULL, '2004-11-11 17:34:02', 10, 10),
(11, NULL, '1988-10-30 09:28:02', NULL, '2015-12-29 00:02:13', 1, 11),
(12, NULL, '2016-01-09 09:38:29', NULL, '2013-08-08 10:15:34', 2, 12),
(13, NULL, '1986-07-23 17:53:38', NULL, '1985-02-09 21:29:36', 3, 13),
(14, NULL, '2019-04-17 22:30:27', NULL, '1996-02-19 02:09:59', 4, 14),
(15, NULL, '1986-10-21 23:08:25', NULL, '1980-06-22 01:26:40', 5, 15),
(16, NULL, '2002-06-18 11:05:49', NULL, '1999-10-20 10:55:56', 6, 16),
(17, NULL, '1997-03-08 12:14:44', NULL, '2002-05-23 03:38:39', 7, 17),
(18, NULL, '1998-11-25 09:09:49', NULL, '2004-07-26 08:41:03', 8, 18),
(19, NULL, '1992-11-28 11:26:38', NULL, '1997-03-31 04:39:25', 9, 19),
(20, NULL, '1972-03-31 01:28:04', NULL, '2002-07-20 17:28:09', 10, 20),
(21, NULL, '2003-11-24 00:54:55', NULL, '2010-12-24 15:40:06', 1, 21),
(22, NULL, '1988-01-28 11:50:30', NULL, '1985-10-26 05:38:02', 2, 22),
(23, NULL, '1973-01-29 13:15:58', NULL, '1991-06-19 16:22:47', 3, 23),
(24, NULL, '2015-06-09 08:30:25', NULL, '1981-11-07 21:21:44', 4, 24),
(25, NULL, '2015-01-29 06:58:21', NULL, '2005-09-09 08:57:16', 5, 25),
(26, NULL, '1971-01-27 19:03:19', NULL, '2003-09-28 01:30:59', 6, 26),
(27, NULL, '1987-02-16 06:13:56', NULL, '1971-08-30 20:07:17', 7, 27),
(28, NULL, '1989-09-08 02:42:58', NULL, '2014-04-29 13:14:55', 8, 28),
(29, NULL, '1988-10-22 03:26:13', NULL, '2009-06-19 13:05:47', 9, 29),
(30, NULL, '2001-12-31 09:45:41', NULL, '2007-12-31 01:52:48', 10, 30),
(31, NULL, '2009-09-30 07:21:40', NULL, '2003-04-21 12:02:36', 1, 31),
(32, NULL, '1984-04-21 09:45:08', NULL, '2003-08-28 13:37:08', 2, 32),
(33, NULL, '2007-08-08 06:29:37', NULL, '1979-05-28 08:56:12', 3, 33),
(34, NULL, '2006-06-10 20:41:58', NULL, '1989-03-06 02:28:50', 4, 34),
(35, NULL, '1995-01-31 21:18:59', NULL, '1985-08-11 06:52:19', 5, 35),
(36, NULL, '1984-01-21 17:22:30', NULL, '2006-08-10 04:59:37', 6, 36),
(37, NULL, '1993-10-16 00:21:27', NULL, '1997-07-23 19:34:08', 7, 37),
(38, NULL, '1989-04-18 05:42:04', NULL, '1984-02-26 19:55:57', 8, 38),
(39, NULL, '1987-10-18 18:24:00', NULL, '1982-02-10 01:17:12', 9, 39),
(40, NULL, '1994-04-22 02:52:22', NULL, '1998-06-21 08:47:24', 10, 40),
(41, NULL, '1983-07-22 01:28:21', NULL, '2003-04-22 05:49:19', 1, 41),
(42, NULL, '1984-06-04 17:27:22', NULL, '2011-11-15 04:25:23', 2, 42),
(43, NULL, '1989-07-15 07:57:14', NULL, '2007-06-17 21:16:09', 3, 43),
(44, NULL, '2007-06-02 16:29:27', NULL, '1980-07-23 19:40:10', 4, 44),
(45, NULL, '1980-01-01 05:49:29', NULL, '1973-12-22 02:16:06', 5, 45),
(46, NULL, '2005-06-14 17:26:53', NULL, '1999-03-22 17:38:47', 6, 46),
(47, NULL, '1976-03-18 20:26:56', NULL, '1977-08-11 01:15:24', 7, 47),
(48, NULL, '1978-04-01 00:59:12', NULL, '1981-03-16 04:23:48', 8, 48),
(49, NULL, '1982-09-28 21:44:31', NULL, '2006-11-16 03:00:19', 9, 49),
(50, NULL, '1997-09-07 12:18:09', NULL, '2011-03-01 12:26:10', 10, 50),
(51, NULL, '1979-01-29 19:21:44', NULL, '2009-01-19 12:03:26', 1, 51),
(52, NULL, '1971-05-03 02:24:02', NULL, '1970-05-15 18:35:15', 2, 52),
(53, NULL, '1998-08-14 00:25:23', NULL, '1983-04-26 07:39:28', 3, 53),
(54, NULL, '1998-02-28 15:43:36', NULL, '1971-10-20 02:01:40', 4, 54),
(55, NULL, '1995-12-13 05:07:57', NULL, '2011-09-15 23:57:53', 5, 55),
(56, NULL, '2008-10-24 13:42:52', NULL, '1998-11-06 18:49:36', 6, 56),
(57, NULL, '2016-11-12 04:57:23', NULL, '1982-10-28 00:47:07', 7, 57),
(58, NULL, '2001-11-20 00:52:45', NULL, '2016-06-15 18:13:07', 8, 58),
(59, NULL, '2006-08-20 04:22:03', NULL, '1989-12-11 09:27:22', 9, 59),
(60, NULL, '1993-05-13 11:59:31', NULL, '1978-10-24 14:08:56', 10, 60),
(61, NULL, '1990-08-01 11:56:19', NULL, '1997-04-13 04:49:15', 1, 61),
(62, NULL, '1972-12-20 20:52:17', NULL, '2013-07-12 07:08:20', 2, 62),
(63, NULL, '1987-03-17 17:56:32', NULL, '2013-12-13 12:39:32', 3, 63),
(64, NULL, '2010-07-03 19:32:49', NULL, '2018-04-15 04:03:13', 4, 64),
(65, NULL, '2006-12-01 10:43:52', NULL, '2002-05-07 00:56:17', 5, 65),
(66, NULL, '2009-03-12 19:48:08', NULL, '1986-02-05 17:22:07', 6, 66),
(67, NULL, '1992-01-19 20:55:22', NULL, '1993-04-21 19:42:44', 7, 67),
(68, NULL, '2001-04-10 10:12:18', NULL, '1980-08-20 23:21:58', 8, 68),
(69, NULL, '1987-12-14 07:56:47', NULL, '2007-09-24 14:16:32', 9, 69),
(70, NULL, '1977-06-21 15:39:08', NULL, '2017-12-25 06:48:59', 10, 70),
(71, NULL, '2000-10-14 12:08:50', NULL, '1993-12-22 18:24:45', 1, 71),
(72, NULL, '1974-01-11 07:58:28', NULL, '1989-10-09 00:13:05', 2, 72),
(73, NULL, '2009-04-20 20:09:42', NULL, '2015-07-07 11:23:31', 3, 73),
(74, NULL, '1980-01-06 13:33:36', NULL, '1997-11-24 18:33:33', 4, 74),
(75, NULL, '2008-07-09 21:17:22', NULL, '2016-12-12 06:34:11', 5, 75),
(76, NULL, '2007-05-28 06:37:48', NULL, '1975-05-08 10:13:31', 6, 76),
(77, NULL, '2011-11-24 22:42:32', NULL, '1991-07-08 20:05:51', 7, 77),
(78, NULL, '1994-01-09 06:11:55', NULL, '2015-03-25 01:58:37', 8, 78),
(79, NULL, '1999-10-19 04:32:31', NULL, '1996-04-24 06:09:32', 9, 79),
(80, NULL, '1988-02-21 02:21:59', NULL, '2014-03-25 07:27:08', 10, 80),
(81, NULL, '1989-10-11 12:49:16', NULL, '1996-08-12 14:13:16', 1, 81),
(82, NULL, '1995-01-28 02:51:34', NULL, '1991-08-14 15:11:54', 2, 82),
(83, NULL, '1996-11-05 07:21:50', NULL, '1997-03-11 18:15:38', 3, 83),
(84, NULL, '1988-12-19 23:31:12', NULL, '1983-10-13 01:40:12', 4, 84),
(85, NULL, '1984-08-14 09:08:52', NULL, '1971-05-02 11:47:56', 5, 85),
(86, NULL, '1996-07-09 21:51:30', NULL, '1981-07-23 04:39:54', 6, 86),
(87, NULL, '1976-08-03 21:46:53', NULL, '1977-07-27 16:33:43', 7, 87),
(88, NULL, '1996-05-11 05:35:24', NULL, '2019-03-29 03:17:34', 8, 88),
(89, NULL, '2004-11-07 22:02:46', NULL, '2017-06-08 23:38:40', 9, 89),
(90, NULL, '1977-06-18 07:45:52', NULL, '1992-08-20 21:59:17', 10, 90),
(91, NULL, '2017-09-27 17:02:05', NULL, '1985-11-10 07:13:49', 1, 91),
(92, NULL, '1978-03-30 04:36:06', NULL, '2000-06-26 05:55:08', 2, 92),
(93, NULL, '1975-03-17 18:46:28', NULL, '1994-01-08 22:38:28', 3, 93),
(94, NULL, '1990-08-22 12:24:45', NULL, '1987-07-02 16:08:03', 4, 94),
(95, NULL, '2010-11-28 05:50:31', NULL, '1995-11-27 09:24:50', 5, 95),
(96, NULL, '2009-07-24 18:42:53', NULL, '2001-12-05 09:50:54', 6, 96),
(97, NULL, '2016-12-27 22:51:38', NULL, '1978-05-05 18:26:02', 7, 97),
(98, NULL, '2006-12-05 18:42:04', NULL, '1987-05-11 15:56:14', 8, 98),
(99, NULL, '2001-04-15 18:52:39', NULL, '1979-08-26 00:39:56', 9, 99),
(100, NULL, '1978-04-12 12:40:41', NULL, '1990-07-29 21:07:00', 10, 100);

-- --------------------------------------------------------

--
-- Structure de la table `publication_state`
--

DROP TABLE IF EXISTS `publication_state`;
CREATE TABLE IF NOT EXISTS `publication_state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `value` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `publication_state`
--

INSERT INTO `publication_state` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `value`) VALUES
(1, NULL, '1976-03-08 22:12:13', NULL, '1980-06-10 14:51:06', 'et'),
(2, NULL, '1977-12-02 18:16:56', NULL, '1999-01-06 18:05:11', 'et'),
(3, NULL, '1997-03-16 06:11:35', NULL, '2008-03-26 13:51:23', 'amet'),
(4, NULL, '2003-10-16 04:57:49', NULL, '1980-05-28 16:10:00', 'distinctio');

-- --------------------------------------------------------

--
-- Structure de la table `revision`
--

DROP TABLE IF EXISTS `revision`;
CREATE TABLE IF NOT EXISTS `revision` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_by` int(11) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `last_modified_by` int(11) DEFAULT NULL,
  `last_modified_date` datetime DEFAULT NULL,
  `answer_time` datetime DEFAULT NULL,
  `feedback_time` datetime DEFAULT NULL,
  `file` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `student_anwser` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `supervisor_feedback` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `publication_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK29ar7qufp6jssku96urfotf98` (`publication_id`)
) ENGINE=MyISAM AUTO_INCREMENT=101 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Déchargement des données de la table `revision`
--

INSERT INTO `revision` (`id`, `created_by`, `created_date`, `last_modified_by`, `last_modified_date`, `answer_time`, `feedback_time`, `file`, `student_anwser`, `supervisor_feedback`, `publication_id`) VALUES
(1, 1, '2011-12-06 00:48:34', NULL, '2018-07-08 13:06:06', '2015-08-05 12:16:16', '1974-08-30 15:27:36', NULL, 'Voluptas quo numquam explicabo molestiae. Culpa consequuntur deleniti eligendi ipsa quos placeat saepe. Repudiandae provident temporibus distinctio quam maiores et dignissimos. Sed quisquam et eaque.', 'Non quam iure enim qui nam natus rerum. Perferendis repellendus accusamus sit omnis asperiores. Veniam aliquid sapiente qui qui doloremque tempora fuga. Alias in qui fugit ad ut sapiente.', 1),
(2, 2, '1978-06-03 13:54:53', NULL, '2016-04-28 15:33:40', '1975-10-26 05:44:22', '1973-12-16 13:32:55', NULL, 'Id harum quia rerum quam qui vel incidunt quod. Quo cum ut dolorem nisi animi qui recusandae. Voluptatem eius magnam quasi dolores in excepturi tempora. Rerum sed velit non deserunt modi.', 'Expedita delectus sit dicta quas. Harum cupiditate enim consequatur earum officiis. Id est aliquam ut voluptatem labore quae qui. Cum minus debitis eius facere.', 2),
(3, 3, '1995-10-11 01:03:04', NULL, '1984-02-06 12:37:03', '2015-02-12 02:07:34', '2005-05-31 04:37:18', NULL, 'Quos aut nihil et dicta unde officia. Qui nam et repellendus. Ipsum officiis ut aut cumque suscipit velit maxime.', 'Ut et qui voluptates exercitationem earum nihil aliquid quibusdam. Sequi consectetur veritatis rem in. Quo vel ipsam quibusdam et qui totam deserunt.', 3),
(4, 4, '2016-04-29 15:18:18', NULL, '1993-12-09 21:33:32', '1997-01-01 12:56:58', '1973-11-20 08:15:15', NULL, 'Nam mollitia animi vitae qui sequi id qui. Est alias error ratione eos sequi perspiciatis. Qui itaque ut minima reiciendis. Ab corrupti sit recusandae sequi eius id qui.', 'Nobis dolore omnis qui nihil iusto dolorem sit voluptatibus. Sequi tempora dolorum debitis esse voluptatem incidunt doloribus. Sed et nostrum assumenda delectus accusantium.', 4),
(5, 5, '1986-11-05 11:41:36', NULL, '2002-08-22 03:46:06', '1993-10-27 19:46:36', '1991-05-06 16:22:45', NULL, 'Dolorum voluptatem maxime rerum ipsa dignissimos nihil quaerat minima. A magnam id iusto voluptatem delectus inventore commodi. Natus ipsa ex enim.', 'Nemo provident et saepe aspernatur aut. Sit et omnis laboriosam quidem aut. Est illum ut earum blanditiis.', 5),
(6, 6, '2001-01-16 19:18:21', NULL, '2001-05-10 21:37:14', '2003-10-27 06:17:02', '2004-09-06 21:40:58', NULL, 'Dolores et natus nihil nulla quo asperiores. Nisi ut ipsam ex.', 'Facere et deserunt aut in ex. Qui non nihil iusto minus sint. Quae aut laboriosam libero magnam.', 6),
(7, 7, '1990-11-30 08:45:19', NULL, '1973-11-24 06:28:21', '1992-03-24 02:27:16', '1991-12-24 12:30:14', NULL, 'Nemo eum veniam earum voluptas. Qui et maiores mollitia aut. Officiis eos et et dicta autem. Nihil ad consequatur ab voluptatem dicta qui pariatur.', 'Ut alias sit ipsa voluptas. Quia voluptatem quos saepe corporis aut. Ex voluptatum iusto ut sit sed ratione. Esse a assumenda qui rerum et at.', 7),
(8, 8, '1995-02-08 04:20:50', NULL, '1979-08-21 10:24:42', '2015-02-23 13:01:20', '2009-09-05 06:43:31', NULL, 'Quisquam hic omnis provident. Iure vitae autem provident dignissimos ut at. Quidem et possimus rerum error aut voluptas et.', 'Ratione esse deleniti exercitationem voluptas sequi. Autem ut hic officia dolorum.', 8),
(9, 9, '2018-12-05 00:35:48', NULL, '2005-09-01 22:37:39', '1983-12-30 15:35:56', '2002-12-24 20:07:54', NULL, 'Pariatur quia aut et error qui quisquam libero. Et commodi consectetur sint non quibusdam nesciunt quasi quia. Quis id ducimus optio harum ut numquam cum. Et et quo eaque quas vero minima.', 'Aliquid fugiat ex sint sed modi enim. Quae error in sunt asperiores harum doloremque. Sint labore atque accusamus perferendis recusandae. Labore officia voluptates ut asperiores rerum assumenda et.', 9),
(10, 10, '1993-02-14 06:12:37', NULL, '1987-08-27 10:25:02', '2002-10-29 11:29:36', '1976-10-24 22:12:47', NULL, 'Illum sint quia voluptatem consequatur perferendis. Fugit sunt vero et quod. Quae suscipit vel numquam quae odio fuga. At tempore eum rerum mollitia dolor.', 'Doloribus illo dolorum accusamus molestiae vel quia et aperiam. Soluta unde rerum amet aut doloribus optio.', 10),
(11, 11, '2003-07-02 14:33:21', NULL, '2005-08-06 08:28:42', '1980-09-18 22:18:58', '2010-08-12 20:13:45', NULL, 'Est porro dolorem sit vitae sapiente mollitia. Cumque nobis dolor ut quos ut voluptatibus aut. Corporis quis debitis rerum aut iusto.', 'Debitis doloremque ea fugiat quo sequi ipsum. Incidunt et minus rerum in repellat aspernatur. Rem quas ab qui sed modi ea eum. Ullam nulla voluptas sed et veniam fugiat.', 11),
(12, 12, '2018-03-02 16:10:59', NULL, '1993-01-11 20:31:40', '2018-03-23 19:52:55', '2002-06-09 16:32:36', NULL, 'Consectetur est non velit aut. Non voluptatem quasi distinctio ipsa non minima.', 'Amet soluta corporis voluptatem vitae inventore quia aut. Voluptas quis delectus iste voluptas. Sit et et architecto expedita optio et eaque.', 12),
(13, 13, '2004-06-22 16:14:28', NULL, '2007-12-23 01:59:50', '1986-10-01 19:22:00', '1981-09-07 11:43:27', NULL, 'Sed quam magni non recusandae accusamus alias porro omnis. Quidem quo voluptatem architecto quia molestiae. Quae necessitatibus quisquam atque.', 'Quaerat sit adipisci voluptas consequatur similique in. Quia sint accusamus beatae nisi. Consequatur ea incidunt ea ut. Deserunt animi non totam assumenda.', 13),
(14, 14, '1995-07-11 14:31:34', NULL, '1994-12-12 13:15:05', '2016-06-16 20:25:26', '1974-02-28 04:11:25', NULL, 'Omnis dignissimos voluptate dolor itaque. Id sed est est placeat iste. Sapiente ipsam sit facilis optio doloremque adipisci. Perspiciatis ea quia laboriosam laboriosam. Assumenda assumenda reiciendis vel ullam non sed dicta.', 'Rem sit quos asperiores culpa veniam quibusdam. Esse harum accusamus neque natus alias aspernatur. Ipsum et tenetur dignissimos.', 14),
(15, 15, '1986-09-27 12:23:55', NULL, '1993-10-02 18:54:43', '2016-05-13 16:28:41', '1980-10-17 06:40:43', NULL, 'Magni labore est quisquam hic ea fugiat. Illo deleniti ipsum est dolorem ipsam in vel. Aliquid excepturi et nobis temporibus rerum ut. Velit sit dolor necessitatibus eos debitis debitis eum temporibus.', 'Nam eligendi vel atque officiis. Velit cum illum id distinctio. Consectetur quae ex sed quo est. Quibusdam dolores corrupti ut quia.', 15),
(16, 16, '2009-03-01 17:23:21', NULL, '2010-06-14 22:12:15', '1999-09-29 15:12:03', '2003-09-20 08:54:24', NULL, 'Illo quos sapiente repudiandae sit quia sapiente. Totam quia quae aliquam magnam. Omnis hic illo dolores occaecati quo.', 'Placeat modi necessitatibus est reiciendis optio laudantium magni. Fuga sit magnam sint. Rem provident nam nesciunt sit.', 16),
(17, 17, '1972-05-28 10:34:30', NULL, '2000-02-13 00:12:45', '2016-03-04 10:01:49', '2018-09-03 10:01:54', NULL, 'Minus incidunt dolores commodi amet illum ea. Aperiam et voluptas vel corporis id exercitationem. Dolorem facilis velit dicta eligendi. Magnam et sit est.', 'Doloremque dolores aut ducimus qui aliquid. Maxime optio explicabo eum cum incidunt. Expedita omnis ut commodi autem doloremque. Dolorum ab veniam rerum est. Quia sed ut cumque.', 17),
(18, 18, '1975-02-04 03:28:00', NULL, '2012-12-06 20:01:18', '2017-01-16 09:26:15', '2012-10-18 23:04:31', NULL, 'Aspernatur eum voluptatem reprehenderit in. Qui voluptate similique culpa nihil quis et. Vel est quisquam magni enim. Et sapiente voluptatem molestiae nesciunt inventore nobis.', 'Ullam omnis commodi aut tempora voluptatem ipsam quia. Incidunt et dolor et rem ipsum quas et consequatur. Aut maxime adipisci non quibusdam quis impedit. Voluptates ducimus qui accusamus reiciendis aspernatur. Provident in et eaque quia sint dolores qui.', 18),
(19, 19, '1979-05-17 09:23:29', NULL, '2016-12-12 11:44:57', '2012-06-27 08:19:54', '1990-01-08 19:07:39', NULL, 'Sed laborum deleniti aut aperiam unde distinctio sit. Earum similique qui molestias porro est excepturi.', 'Modi pariatur dolores est. Et et et beatae ad aspernatur at. Ipsum iure facilis voluptates impedit dolore dolore.', 19),
(20, 20, '2009-04-24 14:54:43', NULL, '2003-07-09 09:58:54', '1975-06-02 15:36:11', '2017-09-15 00:53:55', NULL, 'Nisi maiores doloremque et doloremque perspiciatis. Molestiae recusandae porro adipisci nesciunt vel et. Fugit ut fuga quidem soluta eos aut similique sapiente.', 'Veniam sequi sed ut voluptatem. Aspernatur exercitationem laborum omnis porro dolore. Vel cum consequatur facere totam. Enim non sed odio molestias odio perspiciatis eius. Laboriosam minima nihil ullam soluta mollitia esse.', 20),
(21, 21, '1980-10-14 14:39:07', NULL, '1999-08-09 03:32:09', '2007-02-12 08:04:53', '1971-02-20 07:03:44', NULL, 'Autem voluptas pariatur dignissimos eligendi ipsa. Optio aperiam sint id nam eos dolore possimus. Odio ea consequatur accusantium fuga eveniet fugit et. Blanditiis magnam exercitationem aut ad nesciunt dolore minus id.', 'Quas debitis dolor atque et ducimus architecto. Dolor quo aut officia. Et quia dolore est reiciendis temporibus placeat. Ex necessitatibus nobis eum earum.', 21),
(22, 22, '1992-10-20 08:39:24', NULL, '2004-03-10 08:00:51', '1972-02-24 05:44:15', '1970-01-11 02:27:38', NULL, 'Incidunt doloremque beatae possimus quia aperiam voluptatibus. Velit quia provident libero et. Asperiores dolor mollitia culpa unde quibusdam veritatis.', 'Facilis dolores vel est ea tenetur exercitationem debitis. Dolore sit voluptatum vero esse et et atque. Cum minus adipisci dolores expedita itaque. Odio enim tenetur omnis doloremque quo aut. Explicabo rerum rerum repellendus esse.', 22),
(23, 23, '1987-01-25 09:42:31', NULL, '1997-10-15 06:39:33', '1988-10-21 22:40:24', '2017-06-05 14:27:40', NULL, 'Consequatur vero sed maiores. Doloribus atque ex aspernatur ut. Perspiciatis alias magnam ea commodi adipisci ut. Fugit incidunt et et perspiciatis tempora.', 'Ab qui molestiae nisi quo. Exercitationem perferendis dolores corrupti corporis. Voluptas et qui fuga non qui distinctio laboriosam. Unde voluptatem earum dolores autem.', 23),
(24, 24, '1983-03-10 18:50:36', NULL, '2010-08-04 15:59:35', '2013-12-18 22:05:26', '1979-02-26 17:34:19', NULL, 'Voluptatem laudantium sint voluptate qui ut quam. Quia earum iste maiores porro commodi rerum. Facere consequatur ipsam quae vero perspiciatis. Rerum accusamus harum consequatur aut dicta cum.', 'Quis eligendi culpa consequatur qui. Est corporis iste soluta non.', 24),
(25, 25, '2007-06-20 22:16:01', NULL, '1996-06-05 12:05:50', '1991-09-04 09:15:43', '1993-06-19 04:22:05', NULL, 'Aperiam in temporibus harum quidem. Occaecati sint accusamus non totam neque praesentium. Asperiores aliquam aut ut dolorem harum sunt quae quaerat.', 'Accusamus aut et facilis tempora veniam laborum saepe. Voluptatibus saepe expedita in iusto molestiae minima. Consectetur quam labore eaque occaecati enim.', 25),
(26, 1, '1988-07-24 04:44:07', NULL, '2013-01-24 06:33:16', '1987-06-12 07:43:21', '2013-09-08 06:49:00', NULL, 'Est delectus alias vero ducimus enim hic officiis dignissimos. Fuga vel error sit sed voluptas qui expedita. Odio numquam dolores omnis molestias dolorem molestiae. Quia sint eveniet quia numquam esse autem recusandae.', 'Provident quibusdam id blanditiis cumque laudantium est sit. Similique et commodi et consequatur quo molestiae suscipit.', 26),
(27, 2, '2004-11-19 16:42:36', NULL, '1976-11-27 03:08:59', '1989-02-24 22:21:55', '1984-09-12 09:14:26', NULL, 'Sint porro qui impedit dolor. Et beatae alias aut sit voluptatem saepe nostrum. Doloribus et provident vel unde.', 'Maxime delectus voluptatibus sunt nesciunt ut facere. Sequi maxime suscipit quia voluptas sit dolorum harum.', 27),
(28, 3, '1995-03-19 17:48:03', NULL, '1985-01-02 10:28:30', '1993-01-19 13:35:22', '2011-06-21 07:02:07', NULL, 'Laudantium repudiandae totam fuga officia. Debitis praesentium culpa modi. Maxime illum ut molestiae ea. Doloremque eius tempore neque expedita qui.', 'Vero sequi quibusdam asperiores laborum voluptas perspiciatis et. Numquam laboriosam incidunt error ut. Inventore et modi nihil inventore accusantium. Iste alias excepturi quia perspiciatis rerum.', 28),
(29, 4, '2008-09-22 11:57:08', NULL, '2012-07-18 05:16:58', '1987-07-01 07:17:56', '1994-01-04 21:15:12', NULL, 'Deleniti architecto qui ab. Sequi voluptatem est pariatur est et. Libero nemo ut libero et.', 'Maiores et earum quidem quaerat deserunt quia ut. Aliquam porro rerum consequatur reiciendis nulla id. Sint quia temporibus illum quidem autem possimus.', 29),
(30, 5, '1986-01-23 11:16:28', NULL, '1975-11-28 12:07:17', '1991-07-11 16:14:26', '2012-08-17 15:32:02', NULL, 'Quia est quia asperiores placeat atque quae. A nobis repellat ullam ipsum. Consequatur et asperiores ea quia ut nemo. Dicta ducimus qui accusantium adipisci dolorem libero amet voluptate.', 'Id eos mollitia natus dolorum molestiae. Eum nisi aut labore temporibus. Rerum aliquid dolores cupiditate nihil non reiciendis impedit. Laudantium sunt eos beatae.', 30),
(31, 6, '2017-07-21 15:35:12', NULL, '1987-04-29 04:51:25', '2011-07-10 00:08:25', '1994-09-15 18:38:15', NULL, 'Ducimus itaque optio pariatur eos pariatur praesentium. Deserunt qui adipisci reiciendis atque asperiores. Et voluptas ut ut ex. Sed distinctio quae ea nihil accusamus vel.', 'Quod rem quis qui aut vero sunt voluptatem. Ullam expedita recusandae dolorem ut explicabo eos. Beatae id suscipit veritatis ipsa quod nulla. Quam illo facilis hic ex iste ut iusto.', 31),
(32, 7, '2007-02-11 09:10:15', NULL, '2013-11-07 01:07:46', '2003-06-27 15:48:53', '1988-01-17 00:29:46', NULL, 'Quas laborum dolorum fuga ut et qui itaque. Perspiciatis libero atque omnis distinctio iusto quaerat quo. Omnis sunt voluptas et dignissimos non repellendus.', 'Corporis fugit tenetur natus ea. Quidem repellat reiciendis doloribus dolor. Aliquam nobis ipsum sequi rerum fuga molestiae repudiandae consequatur. Eveniet perferendis aut rerum in sunt praesentium.', 32),
(33, 8, '2013-06-04 15:50:01', NULL, '1987-10-25 18:46:39', '1990-11-15 18:17:58', '2014-10-24 07:49:10', NULL, 'Nisi ipsum mollitia blanditiis dolor voluptatem soluta minima qui. In sed saepe fuga omnis accusamus ut. Dolor sequi assumenda facere voluptate optio reprehenderit consequatur. Iure accusantium esse soluta voluptate inventore qui iure.', 'Laborum quisquam quia quaerat. Iure aut voluptatem deserunt dolores facilis. Quia quis aut incidunt explicabo reprehenderit quia delectus.', 33),
(34, 9, '2008-11-26 17:20:44', NULL, '2013-01-04 05:24:54', '2016-10-25 11:47:03', '1982-06-13 04:34:29', NULL, 'In iusto impedit ea cum voluptatum modi voluptatum. Totam quas saepe quo qui sint quia. Ab facere odio quis ut incidunt.', 'Voluptate nostrum ipsum aut excepturi rem architecto. Temporibus impedit praesentium tempora. Rerum numquam velit commodi dolores. Vel aut ut eaque vero.', 34),
(35, 10, '1996-09-18 06:35:56', NULL, '2016-10-13 08:48:20', '2004-06-06 02:35:20', '1991-10-17 21:37:47', NULL, 'Est voluptatum est vero. Ratione id iste vel et. Maiores sed qui quis incidunt veniam voluptate.', 'Consequatur non rerum qui. Molestiae expedita a officia libero dolores voluptate. Eveniet sed sunt veniam omnis eos fuga.', 35),
(36, 11, '1996-03-23 08:43:21', NULL, '1970-07-03 02:13:50', '2008-02-16 12:23:14', '2017-08-06 20:40:31', NULL, 'Rerum dolor dolor modi voluptatum et et est. Illum est expedita voluptatem velit. Cumque quam expedita autem ipsum.', 'Quaerat corrupti consectetur eum sunt ut ut quidem. Modi vel ducimus aliquid quibusdam laborum repellat. Aut adipisci cupiditate labore aliquid illum.', 36),
(37, 12, '1970-12-28 08:12:50', NULL, '1991-12-11 10:05:12', '1975-10-26 03:13:07', '1973-09-24 08:14:40', NULL, 'Quibusdam consequatur sit in ea. Earum voluptas doloribus nesciunt dignissimos qui debitis commodi illo. Et sint dolorem nisi.', 'Excepturi possimus molestiae praesentium delectus eos. Atque enim non recusandae reprehenderit voluptatem. Deserunt laudantium omnis magni minus. A consectetur et laboriosam non.', 37),
(38, 13, '1999-04-18 02:57:57', NULL, '2016-04-02 22:21:50', '1977-03-08 04:50:08', '1993-10-07 18:22:28', NULL, 'Quis ad quas fuga omnis asperiores voluptate repellendus ut. Rem earum mollitia error aperiam. Sunt et dignissimos voluptas molestiae fuga voluptatem. Repellendus est consequuntur sint.', 'Ullam doloremque nihil voluptas nulla dignissimos qui dolor. Facere nobis sint reprehenderit tempore cupiditate. Et fugiat illo aut. Nulla ab harum quae non hic excepturi ullam.', 38),
(39, 14, '2005-04-01 23:15:56', NULL, '1977-11-16 12:05:50', '2010-05-12 02:14:34', '2009-03-21 05:33:47', NULL, 'Non possimus sed ipsam et. Error quis veniam praesentium illo aut et officia. Explicabo et et similique alias eaque rerum tenetur. Deserunt rem quia repudiandae possimus optio.', 'Alias nihil est molestiae voluptatum non quisquam. Ut id necessitatibus neque ducimus vel non. Consequuntur sint sint repudiandae ut necessitatibus quas dolorem.', 39),
(40, 15, '1992-10-03 08:56:39', NULL, '1991-04-21 23:28:33', '2014-12-04 12:41:22', '2009-03-02 11:24:35', NULL, 'Nam laboriosam ullam dolor perferendis facilis. Sapiente culpa provident omnis beatae numquam. Sed voluptate quo minus vitae eligendi mollitia animi.', 'Possimus eligendi et id. Quo provident reiciendis veniam consectetur minus ut. Beatae rem a consectetur nobis autem minus fugiat.', 40),
(41, 16, '1981-06-25 07:10:30', NULL, '1980-09-08 02:42:53', '1985-12-02 01:53:25', '1996-12-22 01:34:14', NULL, 'Saepe natus quam eligendi voluptatem quia sint molestiae illum. Ex et dicta ut. Non dignissimos ea tempora vel non. Quam est cupiditate quam accusantium veritatis et.', 'Tempore consequatur dolores architecto. Quos et ducimus aut odit. Quisquam voluptates et corporis repudiandae debitis.', 41),
(42, 17, '1978-07-05 21:54:26', NULL, '1997-02-07 14:19:46', '1971-09-06 17:22:29', '2018-11-20 01:03:13', NULL, 'Recusandae perspiciatis deleniti necessitatibus quis qui occaecati. At ea rerum assumenda minima accusamus recusandae excepturi. Facere repellat consequatur sunt cumque.', 'Autem officiis molestiae vitae eligendi alias. Officia totam et facere pariatur.', 42),
(43, 18, '1987-04-02 05:31:32', NULL, '2012-04-17 22:11:55', '2011-04-27 12:56:55', '1970-07-26 19:55:57', NULL, 'Voluptas aut omnis in. Recusandae dolore quos in quo at. Dolore rerum quo autem qui est recusandae. Deserunt ab quae est.', 'Laudantium et eaque unde et. Consequatur nisi autem sunt placeat et minus. Iusto dolor quibusdam temporibus dolores vero ut rerum. Iste nesciunt laudantium repellendus voluptatem.', 43),
(44, 19, '2009-02-16 08:16:36', NULL, '1979-03-20 23:30:02', '1999-04-23 12:24:51', '2006-12-05 21:01:46', NULL, 'Harum enim animi enim officia. Quia vitae quod harum quod suscipit ut. Eaque quibusdam quo eveniet doloribus consequatur. Quis magnam provident officiis amet omnis est recusandae.', 'Vel enim ut ut quam aut vel voluptatum. Voluptates autem atque minima voluptas ut eius modi unde. Reprehenderit et qui eligendi ab.', 44),
(45, 20, '2004-09-05 09:45:14', NULL, '1992-02-05 19:55:56', '2007-09-23 09:02:33', '2004-02-13 00:30:35', NULL, 'Et tempore sed nulla temporibus quo qui. Quaerat voluptatum est numquam quas. Doloremque illo blanditiis voluptatibus quis facilis explicabo eum ex. Voluptas vel incidunt rerum labore tenetur.', 'Minus et consequatur est voluptatem cum qui. Deserunt in totam earum. Deserunt corrupti tenetur consequatur repellat. Enim sint officia nemo ullam.', 45),
(46, 21, '2005-01-01 01:12:32', NULL, '1990-02-19 23:29:29', '2007-07-01 05:57:56', '1978-03-25 03:31:29', NULL, 'Sed repellat aut et fugiat reiciendis. Ab iusto asperiores excepturi est quia.', 'Atque rerum sit vero ex. Aut laudantium error eum dicta soluta autem quo. Aut et ex ea voluptatibus. Ipsam quia eum ratione in qui dolores.', 46),
(47, 22, '2008-12-14 21:57:24', NULL, '1972-11-01 22:41:48', '2014-03-26 21:01:04', '1990-04-24 14:38:08', NULL, 'Necessitatibus nesciunt eveniet est. Id reiciendis autem sit omnis placeat nobis. Necessitatibus deleniti ipsa consectetur molestias ut dolores aperiam.', 'Ut voluptatem nihil excepturi eum repellendus qui sapiente non. Libero voluptas cum aliquid modi. Aspernatur eius modi asperiores eius dolorem enim doloremque.', 47),
(48, 23, '1979-04-01 17:32:12', NULL, '1997-08-24 05:05:21', '2013-10-23 11:09:21', '1997-06-27 21:40:49', NULL, 'Et dolorem fugit id inventore est laborum consequatur placeat. Consequatur et ex et eius modi est temporibus. Quia veritatis modi qui qui laudantium repudiandae.', 'Similique sed maiores quidem tempore pariatur magnam. Iste nam consequuntur non et vel rerum nihil atque. Et molestiae quod consequuntur commodi nobis.', 48),
(49, 24, '1974-03-07 14:10:15', NULL, '1986-02-08 15:12:58', '1984-04-22 01:53:30', '1999-10-17 08:14:55', NULL, 'Inventore non aut sapiente eius eos. Itaque aut facilis voluptate ullam ut sed qui impedit. Ut cum quia neque est non. Necessitatibus vero est fugiat architecto aspernatur eligendi. Et incidunt odio et voluptatem dolores.', 'Dolores dignissimos in qui sapiente voluptatem. Ut consequatur ut reprehenderit quos dicta impedit est. Aperiam excepturi sunt adipisci qui a. Aliquid accusantium rerum non.', 49),
(50, 25, '2013-06-05 13:49:48', NULL, '1995-01-23 16:42:33', '1987-08-11 18:25:47', '2012-03-29 07:52:11', NULL, 'Pariatur doloribus ex sint accusamus voluptatem occaecati labore. Itaque dolorem nam debitis totam. Minima aliquam aspernatur necessitatibus ea corrupti perspiciatis. In qui fuga ab quod amet.', 'Corrupti in qui beatae doloremque voluptatem neque. Dicta voluptatem corporis quod molestias non debitis dolores aut. Aut quae voluptatibus autem occaecati tenetur assumenda.', 50),
(51, 1, '2019-01-24 12:50:38', NULL, '1990-06-28 09:45:10', '2001-11-11 12:02:43', '1971-01-02 17:33:33', NULL, 'Nam qui ea sed. Illum minus labore libero quibusdam magni quis commodi. Unde dolor nobis quos iste ipsam ut. Sit quia dicta est et qui cum aut.', 'Quam a et dolores laudantium consectetur dolores voluptas. Sed explicabo pariatur quia placeat quis placeat ratione sunt. Laudantium qui eum sit at delectus. Magni porro vitae iste rerum.', 51),
(52, 2, '2006-03-05 14:17:53', NULL, '1978-03-24 04:45:10', '1991-12-27 05:35:39', '1986-12-23 22:22:11', NULL, 'Non occaecati debitis quod explicabo. Non aut a error. Harum perspiciatis voluptatum rerum tempora sed vero.', 'Dolor eius sunt aliquam esse et rerum consequatur. Quam impedit pariatur minus fugiat voluptatem necessitatibus. Et est est et.', 52),
(53, 3, '2015-12-04 14:31:10', NULL, '1978-05-25 13:42:43', '2017-06-21 16:37:51', '1979-10-17 23:01:15', NULL, 'Molestias voluptas repudiandae quasi. Iure dolorum ratione consequatur voluptatibus et. Rerum et aut eos non cumque velit animi. Optio eligendi voluptatem in quaerat fuga sed.', 'Velit a voluptas et laborum rerum facere. Earum deserunt dolores et possimus voluptas similique dolorem. Consequatur consectetur reiciendis occaecati consectetur.', 53),
(54, 4, '2016-10-11 10:28:03', NULL, '1994-11-27 05:53:34', '1976-09-21 22:41:24', '1977-11-17 07:03:32', NULL, 'Alias consequatur saepe commodi sit voluptate blanditiis provident. Quae et at aut quia. Sit sed odio velit rerum reiciendis et. Explicabo ipsa harum voluptates temporibus architecto excepturi pariatur.', 'Ea quia est sit est. Quia et alias et. Et nemo tempore odio voluptatem ad ut.', 54),
(55, 5, '1980-10-28 20:15:28', NULL, '1992-08-07 13:43:04', '1991-08-24 01:43:45', '1998-06-15 00:33:44', NULL, 'Reiciendis eveniet iusto qui non atque. Quas tempore consequatur quas quaerat fugiat est illo aut. Autem atque expedita et eum autem fugiat.', 'Consequatur enim deleniti nam minima. Ullam possimus aut cumque aliquam. Quidem officiis minima unde non sequi quibusdam. Alias quis et accusantium dolores et incidunt.', 55),
(56, 6, '1977-01-07 07:02:05', NULL, '1976-08-11 07:27:02', '2002-04-06 09:29:01', '1976-09-01 21:30:24', NULL, 'Doloremque rerum odio quam aut quis ratione. Doloremque enim aut beatae. Molestias animi et quisquam qui recusandae sed tempora. Iusto id non voluptatibus libero.', 'Incidunt aut molestiae aperiam aut vero. Eos consequatur et dolorum tempora eos. Commodi quaerat quaerat sapiente earum necessitatibus accusamus.', 56),
(57, 7, '2005-10-25 01:09:41', NULL, '2007-03-29 19:39:14', '2013-11-01 16:14:44', '1985-10-13 11:10:59', NULL, 'Natus totam fuga quibusdam ad sed magnam. Rerum sunt autem illo aut qui autem. Dignissimos rerum pariatur dignissimos officia. Sunt vero eaque rem totam voluptate nostrum tenetur. Nobis amet ducimus a possimus animi dolores illo.', 'Perspiciatis totam architecto qui esse porro. Doloribus et tempore distinctio perspiciatis officiis. Velit quam voluptatem reprehenderit deserunt doloribus consectetur quis. Aut dolores necessitatibus dolorem itaque ducimus beatae non. Sint id velit est m', 57),
(58, 8, '1978-05-23 17:18:47', NULL, '1984-06-01 17:36:29', '1987-11-30 14:39:00', '1991-06-22 02:55:16', NULL, 'Distinctio explicabo eum et odio est neque. Ut occaecati sapiente et ad sunt. Occaecati velit corporis sit debitis nesciunt ducimus voluptatem. Magnam perferendis nam qui ea omnis nulla a quasi. Impedit dignissimos nemo qui et.', 'Quisquam error beatae et doloremque minima. Facere illo provident provident fugiat. Natus beatae est voluptas sit deserunt minima sapiente. Sed rem veniam blanditiis corrupti numquam. Eaque sed et non.', 58),
(59, 9, '2019-01-23 03:52:48', NULL, '1987-05-04 05:42:34', '1972-12-08 03:08:14', '2009-08-28 10:37:55', NULL, 'Aut fuga odit sequi sit voluptatem quod maiores. Sed voluptatum occaecati ex nisi impedit debitis sit. Officiis nam doloribus sed hic provident. Voluptas iste non et. Magni occaecati maiores quasi veniam animi.', 'Dicta quae et qui ducimus. Saepe et ea ut hic cum suscipit. Eaque quam eos eum voluptas ut molestiae. Autem quisquam eum voluptatibus dolores modi natus.', 59),
(60, 10, '1977-03-30 09:16:43', NULL, '2012-04-21 21:01:36', '1996-08-07 12:42:47', '1983-08-25 18:15:18', NULL, 'Fuga dicta debitis non alias praesentium. Velit provident explicabo sit nihil. Excepturi amet explicabo numquam sunt laborum adipisci. Exercitationem illo eum autem assumenda facere consectetur officia.', 'Ea culpa voluptas ut ullam. Itaque quo ipsum ea nemo voluptas. Quo sit commodi quae autem asperiores.', 60),
(61, 11, '1993-01-22 23:58:33', NULL, '2014-08-22 07:37:13', '1991-05-22 21:14:21', '2018-04-10 03:48:03', NULL, 'Iure tempore ea ab ut tenetur est repellat. Aperiam rem et nemo recusandae maxime. Omnis et suscipit fugit doloribus molestias. Minus iste corporis modi est distinctio eius tenetur repellat.', 'Velit dolorem consectetur ea possimus mollitia assumenda ad pariatur. Iusto voluptas quo non minima. Tenetur et eius aut molestiae autem quis. Nihil totam ex et aut fuga tenetur atque.', 61),
(62, 12, '2005-12-02 12:23:36', NULL, '2009-01-14 17:01:57', '1976-10-10 18:35:40', '2005-08-21 11:59:23', NULL, 'Nemo consequatur voluptatum quia. Praesentium incidunt doloribus laborum et. Molestiae doloremque neque aliquam quasi. Dicta autem nemo est porro.', 'Placeat voluptatem cum placeat aut voluptatem omnis. Blanditiis aliquid ea quo blanditiis illo. Tempore dolor omnis est in cum. Rerum aspernatur nemo aut. Consectetur dolorum itaque id minima quam veniam.', 62),
(63, 13, '1972-06-07 00:16:44', NULL, '1995-04-08 19:11:22', '1998-09-22 04:40:22', '2018-02-19 23:07:22', NULL, 'Debitis labore fuga alias illo. Repellendus fugit quia reprehenderit quia fugiat blanditiis sunt qui. Soluta omnis consectetur in. Placeat consequuntur cupiditate quibusdam enim quibusdam vitae nesciunt.', 'Illo dolores debitis odio sit optio maiores aperiam nihil. Qui quos dolores facere non omnis ut unde dolor. Commodi non perferendis quidem distinctio quidem adipisci.', 63),
(64, 14, '2012-09-27 15:51:18', NULL, '1992-03-09 15:33:35', '1994-06-30 03:31:12', '1975-10-16 05:05:17', NULL, 'Ad nulla recusandae ullam dicta. Tempora ut nam optio mollitia est ut. Ut est eos cum provident quibusdam sapiente. Maiores rerum quibusdam sint.', 'Aliquid incidunt vitae quae sit. Maiores impedit officia a et temporibus. Beatae perferendis voluptas ut.', 64),
(65, 15, '1987-01-05 19:56:03', NULL, '1997-08-14 19:34:58', '1997-11-26 07:40:44', '1982-09-26 11:10:54', NULL, 'Iste officiis dolorem ipsam soluta distinctio. Earum voluptatem illum harum quis. Consectetur enim qui aut dolor iure error est.', 'Animi molestias corrupti in animi. Ea dolorem veniam aut velit recusandae. A commodi sed debitis.', 65),
(66, 16, '2012-12-10 13:30:18', NULL, '1996-01-02 22:40:56', '2012-03-18 06:27:18', '1998-11-03 03:31:08', NULL, 'Dolorem odit facere ea nihil omnis rem quos. Quis qui ea sit ipsa. Sit consequatur sed illo. Reprehenderit suscipit qui quisquam et voluptas ut officiis. Quidem perferendis nulla molestias at labore tempore qui.', 'Vel repellendus nostrum totam et quos quia. Qui accusamus voluptatem quasi vero odio doloremque aliquam. Maxime voluptatem rerum sint ex. Est rerum et et illum nihil nesciunt.', 66),
(67, 17, '2017-09-25 02:11:17', NULL, '1997-09-05 20:51:03', '2016-01-06 16:37:15', '1970-02-13 05:36:58', NULL, 'Autem voluptatem non provident tenetur. Non est aut nulla labore deserunt error ex dolorem. Sequi architecto inventore magni aut eveniet modi. Et dolorem dolorem voluptate non omnis quidem dolor distinctio.', 'Ea amet reiciendis asperiores sit et et ducimus. Sit aut ea magni sit. Ut et ut iure nesciunt quibusdam odit exercitationem. Cum eum praesentium officia eius reprehenderit quo qui. Optio cum dolore aut cum nemo temporibus similique rerum.', 67),
(68, 18, '1993-05-21 04:45:12', NULL, '2006-05-31 18:57:18', '1996-03-29 21:39:18', '1995-03-18 10:45:33', NULL, 'Consectetur deleniti dignissimos possimus repellat minima. Voluptatum rem harum esse quasi rem. Sint ad ut delectus expedita tenetur magni. Earum non quam voluptas consequatur aut illo.', 'Amet fugit quia nulla quas praesentium. Ut dolores ut fugiat occaecati adipisci non voluptatem. Temporibus illum laboriosam illum rerum.', 68),
(69, 19, '2004-11-16 05:59:19', NULL, '2010-02-25 06:48:22', '1996-05-12 06:52:38', '2019-04-23 11:50:34', NULL, 'Amet illum ab temporibus necessitatibus assumenda eum vel. Sed blanditiis quam quo ipsum. Voluptas reprehenderit esse earum.', 'Quibusdam praesentium et ut provident explicabo facilis ut. Necessitatibus libero aperiam ut ut tempora. Eius perferendis quae rerum. Natus incidunt ullam tenetur corporis minus aut ipsam consequatur.', 69),
(70, 20, '1978-01-12 09:15:25', NULL, '1996-12-03 18:18:51', '1996-06-15 09:13:33', '1980-04-30 08:25:26', NULL, 'Aut et distinctio culpa libero. Qui voluptas voluptas asperiores aut. At ut voluptas id modi ducimus recusandae. Eveniet aut voluptas fugiat quaerat delectus et iusto.', 'Explicabo ullam fuga nobis sed autem minus. Architecto sed doloremque ut quia laudantium. Fuga nemo perferendis ipsam quibusdam deserunt reprehenderit itaque. Architecto quibusdam voluptatum at odit vel.', 70),
(71, 21, '1988-05-20 15:45:13', NULL, '2005-08-15 06:24:03', '1978-03-07 22:54:22', '1991-01-13 06:22:16', NULL, 'Nihil et rem sequi iusto. Corrupti est sint qui necessitatibus dolor. Aperiam tenetur tenetur aut.', 'Expedita et consectetur soluta. Saepe sed corporis vitae aut. Vero molestiae esse amet reprehenderit sed fuga. Voluptatem illo quidem quas aut velit.', 71),
(72, 22, '1976-09-30 18:43:55', NULL, '2002-08-13 17:17:02', '1987-12-23 02:34:04', '2009-11-02 19:17:14', NULL, 'Aperiam alias commodi veniam. Qui veniam ratione ipsam porro quo corporis. Unde ullam delectus quaerat reprehenderit minima similique tempore. Iure maxime ut quod qui.', 'Ut dolore consectetur totam magnam. Porro et dolores maxime. Doloribus ipsa perferendis enim qui eaque.', 72),
(73, 23, '2009-06-13 02:56:16', NULL, '2005-11-21 11:39:52', '1998-07-18 13:02:18', '2005-07-02 06:22:25', NULL, 'Rerum inventore tenetur accusamus. Voluptas harum quae libero omnis culpa. Qui ea delectus voluptas libero. A culpa saepe voluptas cumque enim explicabo.', 'Vel unde necessitatibus maiores eligendi maiores consectetur provident. Illo aut voluptas sint laborum rerum. Magnam quam dolorem dolores et. Laudantium magni ut laudantium animi sed.', 73),
(74, 24, '2018-04-19 21:16:44', NULL, '2012-03-18 13:40:37', '2016-06-14 08:14:23', '1985-07-14 17:30:34', NULL, 'Distinctio rerum repellendus sit illo vitae doloremque. Earum aliquid vero nesciunt eligendi tempora aut. Eum nemo ratione et aut ea ducimus ea autem.', 'Corporis fugiat inventore neque adipisci repellendus. Quia nulla non delectus excepturi ipsum consectetur. Ducimus reiciendis consectetur culpa et sed qui non. Quasi iusto et omnis est libero error.', 74),
(75, 25, '1973-07-20 18:39:58', NULL, '2019-03-22 07:50:06', '2006-03-17 11:17:11', '1987-01-09 02:00:28', NULL, 'Officia tempore sunt esse necessitatibus ut ex quidem voluptatem. Officia ut quos possimus quidem harum. Quas deleniti eum iusto quo sed odio quod ducimus. Eaque voluptatum itaque dolorum voluptatum sit praesentium.', 'Saepe nam temporibus dolor impedit sint aspernatur ut. Quia eius et aut at. Consequatur sed deleniti qui consequatur.', 75),
(76, 1, '1970-07-07 15:22:59', NULL, '1975-01-03 15:54:08', '1994-06-27 07:20:36', '1980-03-08 11:25:12', NULL, 'Nesciunt rerum dicta laudantium rerum fugiat est eaque. Rerum numquam fuga voluptates sed. Nemo dolore consequatur assumenda est neque ut aliquam. Inventore et nemo illo dolores a tempore.', 'Molestias quis architecto officia aut suscipit et dolor. Veritatis temporibus repudiandae error reiciendis architecto temporibus quis. Iste accusamus ut et illum sapiente in voluptatem. Enim consequatur quis sit ea.', 76),
(77, 2, '1990-06-24 13:43:50', NULL, '2018-02-27 14:21:05', '1971-08-26 18:33:02', '1971-11-10 17:59:16', NULL, 'Molestias debitis atque dolores quos suscipit suscipit. Neque neque ut eius qui fugit. Sunt saepe porro et accusamus voluptatem. Eos in eos assumenda dolor ut nulla sed.', 'Earum et reprehenderit dolorem saepe voluptatem. Fugit enim non corporis vel eum eveniet ex. Culpa qui alias voluptatem minus.', 77),
(78, 3, '2000-11-09 23:27:36', NULL, '2000-10-26 05:06:49', '2016-11-06 22:28:32', '1974-08-13 03:05:00', NULL, 'Accusantium itaque qui voluptatum aspernatur. Et expedita qui amet iste. Tenetur est neque omnis voluptatibus minima.', 'Sit quia quia dolorum consectetur ut. Saepe dolores aut quo provident deleniti dolores. Autem modi nobis a et.', 78),
(79, 4, '1980-07-26 23:12:24', NULL, '2016-03-16 05:18:37', '2004-10-21 13:06:50', '1971-07-28 13:16:42', NULL, 'Voluptatem eius dolorem explicabo saepe eum atque ratione eum. Consectetur et inventore dolorem ratione. Aperiam aut qui dolorum commodi est.', 'Et ex enim libero magnam sint ratione. Nesciunt beatae nostrum ea et nihil ut tenetur. Enim est eum consequuntur est.', 79),
(80, 5, '2015-12-09 23:28:28', NULL, '2009-08-02 02:56:19', '2001-10-29 02:19:15', '1986-05-24 16:05:07', NULL, 'Harum sunt velit dolor repudiandae veritatis illum. Ad eum necessitatibus fuga sint ea unde eos. Ex accusamus dolorem dignissimos consectetur. Aliquam soluta cupiditate sint qui eligendi.', 'Minima omnis quia reiciendis ullam vitae quod. Officia quia voluptatem architecto voluptatum et inventore hic. At tenetur et enim at quo. Eum repudiandae quos aut praesentium qui non ullam. Excepturi dicta voluptatibus molestiae laudantium repellendus nis', 80),
(81, 6, '1974-06-29 11:50:16', NULL, '1971-07-31 07:10:45', '1999-10-29 07:19:30', '1995-03-07 05:00:38', NULL, 'Deleniti possimus qui magnam vitae deleniti eligendi autem. Aut aut perspiciatis quod nulla perferendis voluptatem non. Asperiores sunt totam enim quos ipsum temporibus eum.', 'Sunt suscipit et ut omnis aut maiores libero delectus. Tenetur et aut ut iste. Vel molestiae atque autem mollitia perferendis et. Incidunt sint est corrupti.', 81),
(82, 7, '1974-09-10 16:06:22', NULL, '2010-05-24 13:05:36', '2005-12-13 09:41:24', '2017-05-17 00:29:19', NULL, 'Doloremque facere natus autem velit placeat ut saepe. Et tenetur doloremque dolorem placeat nisi repellendus. Velit nesciunt autem sed eum. Iusto excepturi unde officia ut et nemo et.', 'Qui enim est illo ut qui. Aperiam praesentium facere vitae vero. Consequatur quasi aspernatur aut eveniet reprehenderit. Et laborum rem molestiae asperiores saepe voluptatem.', 82),
(83, 8, '1987-09-16 08:02:59', NULL, '1970-12-13 17:16:30', '1999-09-08 17:19:26', '1978-07-22 15:46:24', NULL, 'Voluptatem ut earum est eum qui odio. Vero sapiente iusto quibusdam consequatur. Aut laudantium dolorem eveniet aut. Ea reprehenderit qui distinctio iusto consequatur.', 'Corporis quibusdam commodi aut rerum laborum corporis non. Qui laudantium repellendus deleniti quod aut culpa. Et porro iste nemo sed exercitationem laboriosam unde.', 83),
(84, 9, '1975-08-19 21:29:43', NULL, '1973-07-11 15:12:46', '2019-01-12 06:41:08', '1973-07-02 21:04:25', NULL, 'Libero autem vitae eveniet ullam et. Rerum consequatur quisquam deserunt. Unde laboriosam eum possimus qui non.', 'Incidunt et eos ut aut rerum. Animi voluptatem et fugit consequatur labore at neque. Amet accusamus ex eos aut rerum et sit voluptas. Magnam magnam corrupti et dolore et.', 84),
(85, 10, '1993-05-24 16:32:12', NULL, '1983-02-02 23:18:40', '1976-02-20 04:26:42', '1989-08-21 11:35:21', NULL, 'Molestias quia dolores sapiente officiis deleniti. Neque veritatis accusantium aut cum. Libero ut odit ut qui voluptatibus aut ratione qui. Sint aspernatur qui eveniet sit unde.', 'Nostrum animi ad explicabo nihil. Voluptatem perferendis rerum ea. Quis omnis maiores debitis soluta aut. Dolorem nihil ea velit quasi adipisci quae voluptas ut.', 85),
(86, 11, '1976-02-12 17:21:12', NULL, '1979-03-02 00:04:54', '2008-08-11 09:54:49', '1973-11-04 09:12:32', NULL, 'Qui aperiam et voluptate sapiente consequuntur doloribus provident. Provident quos fuga occaecati. Et facere reprehenderit rerum sit suscipit omnis praesentium quo. Eaque consectetur quam cupiditate necessitatibus enim.', 'Vero assumenda cum consequuntur dolor sint dolorem. Consequatur facere in ea voluptatum veniam id laudantium. Quidem esse et sed molestias dolorem deleniti. Quos molestiae nihil facere laudantium.', 86),
(87, 12, '1994-02-02 09:19:54', NULL, '1979-02-18 13:57:44', '2004-09-16 08:15:36', '2018-01-30 04:16:17', NULL, 'Magni sint sint commodi velit minima et. Dolorem soluta et officia culpa dicta praesentium. Et facilis id laudantium odit aliquid explicabo culpa.', 'Nisi aut eius expedita. Commodi aliquid enim saepe. Odit ab est quasi eos sunt cupiditate.', 87),
(88, 13, '2003-06-21 04:44:29', NULL, '2016-11-27 16:51:03', '1985-06-17 13:06:06', '1985-12-02 15:43:05', NULL, 'Modi qui magnam quia iure eius. Quas fuga iure illo eaque. A repudiandae magni earum cum soluta molestiae. Voluptatibus repudiandae consequatur blanditiis rerum omnis.', 'Et voluptas nesciunt sunt quis aperiam. Odio molestiae quo et similique aut. Perferendis consequatur pariatur natus sunt.', 88),
(89, 14, '1998-12-16 13:21:32', NULL, '2016-04-06 02:15:53', '2004-06-18 16:58:47', '2009-01-22 02:32:43', NULL, 'Qui expedita earum ullam beatae alias dolorem in. Error quo quisquam eum minus sit. Et ut quia libero accusamus sit aut.', 'Nostrum et optio quae voluptates non et repudiandae. Qui reiciendis repellat aut ullam dolorem minima. Hic ut error eligendi numquam quia quia sint. Est ipsam et consequatur aut quos quo.', 89),
(90, 15, '2011-08-16 01:24:58', NULL, '1977-02-13 04:33:25', '1975-06-18 05:06:50', '2007-05-23 04:36:29', NULL, 'Cupiditate eveniet voluptatum aut earum esse qui. Quibusdam quasi ullam in eos ea. Culpa quisquam aut praesentium asperiores. Est occaecati excepturi consequatur.', 'Consequatur maiores rerum inventore numquam voluptate et ab. Sit quidem et consequatur nihil ipsa laborum. At laudantium aliquid quibusdam sunt sint cum ut ipsa.', 90),
(91, 16, '2006-08-07 21:58:08', NULL, '1999-02-11 00:27:56', '1973-03-22 19:00:43', '1973-10-14 00:56:52', NULL, 'Ullam ipsam laboriosam reiciendis et impedit. Quia vero odit nostrum ut harum mollitia ipsum sint. Veritatis fuga culpa libero quo animi est. Id minima odio laudantium et.', 'Ipsum sint atque veniam nihil magni. Enim incidunt repellat accusantium ex laboriosam atque. Ad soluta possimus veniam quaerat praesentium facilis illo.', 91),
(92, 17, '1979-11-10 04:04:26', NULL, '1987-01-01 03:13:48', '1972-01-19 00:11:53', '1978-05-13 23:09:42', NULL, 'Est quaerat debitis consectetur. Expedita molestiae perspiciatis aut nulla est facilis sit est. Reprehenderit non et nobis nihil rerum.', 'Fugiat laborum totam maxime sit itaque labore repudiandae. Placeat debitis magni nulla nobis praesentium minus esse. Id voluptates quod repudiandae distinctio commodi. Non quo dolorum eos enim non.', 92),
(93, 18, '1996-07-21 03:54:02', NULL, '1981-10-18 13:09:56', '1973-02-20 19:13:24', '2007-12-04 21:04:23', NULL, 'Quo saepe a facilis mollitia vitae aliquid ut. Aut rem itaque neque inventore et quis quos. Porro quo suscipit omnis est tempora temporibus.', 'Soluta delectus et repellat quia. Molestiae odio vel quisquam impedit. Ullam sint ut a magnam harum quas. Ut voluptatem sit voluptatem debitis consequatur. Saepe labore adipisci quibusdam non officia explicabo saepe et.', 93),
(94, 19, '2018-11-30 18:05:17', NULL, '2015-06-24 19:22:59', '2004-10-21 16:42:00', '1970-03-19 21:39:07', NULL, 'Optio fugiat sunt maiores laborum. Veniam est harum officiis nulla aperiam placeat est ut. Et consequuntur ea est porro quia omnis. Aut quis pariatur voluptas repellat ab rem.', 'Pariatur provident aspernatur porro eveniet labore. Laboriosam sed beatae et et laboriosam.', 94),
(95, 20, '1988-08-24 17:24:26', NULL, '2008-01-24 00:52:26', '1990-09-26 06:31:13', '1977-02-12 02:48:28', NULL, 'Dicta ratione soluta fugiat unde ea. Similique sed eos reprehenderit et provident. Ipsum perspiciatis facere quis aperiam enim ex facilis dignissimos. Autem voluptatum sed voluptas delectus.', 'Culpa aspernatur culpa mollitia qui ab libero. Aut iste ut rerum nostrum ipsum vel dicta. Eum quia quam quo harum. Dolore sed quia tempore quos ut ut et. Qui quidem totam est perferendis.', 95),
(96, 21, '1973-10-04 12:35:38', NULL, '2015-09-16 17:12:51', '2016-09-20 13:53:32', '2018-11-29 11:55:12', NULL, 'Delectus culpa ex modi quo. Commodi aliquam excepturi quia rerum. Quia exercitationem id et architecto. Illum neque qui facilis sit in. Exercitationem quia magnam et dolor sit rem.', 'Est eos voluptatem dolorem vel. Velit suscipit nihil voluptatem dolorem voluptas.', 96),
(97, 22, '2011-11-06 19:01:08', NULL, '1971-05-29 07:55:52', '1970-06-26 01:22:23', '2007-06-30 11:52:51', NULL, 'Quos aspernatur quibusdam voluptas eaque rerum quo. Aliquid non facere voluptatem ut et quia ut. Reprehenderit adipisci error quo at qui odio. Et voluptatum minima voluptatum quisquam ut.', 'Nulla delectus ipsum consequatur nemo. Labore quia voluptatem voluptas dolores. Sequi porro aut assumenda reiciendis est. Hic quo inventore amet delectus consequatur explicabo.', 97),
(98, 23, '1999-07-29 07:27:12', NULL, '1974-04-01 13:56:26', '1990-09-06 09:48:19', '1985-01-07 15:50:49', NULL, 'Fuga iure omnis ut. Autem consequuntur repellendus adipisci magni omnis incidunt. Facere et perferendis rerum.', 'Beatae distinctio quia officiis maxime reprehenderit pariatur. Hic molestiae harum dolores. Minima voluptatum a rerum alias ex voluptatem.', 98),
(99, 24, '2012-11-29 08:21:31', NULL, '2018-05-26 02:45:31', '1992-09-20 17:28:43', '1980-11-27 16:13:09', NULL, 'Hic blanditiis voluptatem porro quia et quisquam. Aliquam quibusdam soluta quidem minus dolorum dolores laboriosam in. Recusandae aliquam sit consequatur temporibus. Officiis ipsam quas culpa in dignissimos velit maxime.', 'Occaecati nemo ut id nihil omnis nulla mollitia autem. Vel sunt nihil vitae voluptatem laudantium. Qui ut nulla dicta reprehenderit expedita. Dolores sed officiis est tenetur.', 99),
(100, 25, '1980-01-18 21:55:23', NULL, '2017-10-16 01:12:26', '2000-06-11 18:15:37', '1978-11-09 06:47:09', NULL, 'Placeat magni consequatur dolorem similique delectus. Numquam laudantium reiciendis dolores nostrum adipisci repudiandae. Dolores ut culpa saepe ut.', 'Velit culpa dicta neque consequatur voluptatibus ducimus id. Vero sint dolor minima culpa doloribus nemo quis. Qui harum ut quisquam sit vitae. Qui pariatur modi est et aut voluptatem voluptas.', 100);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
