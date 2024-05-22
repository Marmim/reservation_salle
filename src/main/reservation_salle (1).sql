-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 22 mai 2024 à 09:53
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `reservation_salle`
--

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE `paiement` (
  `paiement_type` varchar(31) NOT NULL,
  `id_paiment` bigint(20) NOT NULL,
  `montant` double NOT NULL,
  `cash_tendered` double DEFAULT NULL,
  `bank_id` varchar(255) DEFAULT NULL,
  `bank_name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id_reservation` int(11) NOT NULL,
  `nom_reservant` varchar(255) DEFAULT NULL,
  `salle_reserve` varchar(255) DEFAULT NULL,
  `date_debut` date DEFAULT NULL,
  `date_fin` date DEFAULT NULL,
  `heure_debut` time(6) DEFAULT NULL,
  `heure_fin` time(6) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `reservation`
--

INSERT INTO `reservation` (`id_reservation`, `nom_reservant`, `salle_reserve`, `date_debut`, `date_fin`, `heure_debut`, `heure_fin`) VALUES
(6, 'MASKAZ FJREF', NULL, NULL, '2024-05-28', NULL, NULL),
(7, 'maryame', NULL, '2024-05-13', '2024-05-21', '10:29:00.000000', '13:27:00.000000');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `id_salle` bigint(20) NOT NULL,
  `capacite` int(11) NOT NULL,
  `adresse_salle` varchar(255) DEFAULT NULL,
  `disponibilite` bit(1) NOT NULL,
  `nom_salle` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `tarif` double NOT NULL,
  `type_equipement` varchar(255) DEFAULT NULL,
  `reservation2_id_reservation` int(11) DEFAULT NULL,
  `type_salle_id_type` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `salle`
--

INSERT INTO `salle` (`id_salle`, `capacite`, `adresse_salle`, `disponibilite`, `nom_salle`, `photo`, `tarif`, `type_equipement`, `reservation2_id_reservation`, `type_salle_id_type`) VALUES
(67, 20, 'ain sbaa', b'0', 'salle2', 'https://www.sesam-institut.com/wp-content/uploads/2015/01/IMG_5044.jpg', 400, 'Salle de Formation', NULL, NULL),
(69, 15, 'Rue mohamed 6 casa', b'0', 'salle3', 'https://timoulayhotel.com/img/cn1.jpg', 350, 'Salle de Conférence', NULL, NULL),
(70, 40, ' centre ville', b'0', 'SALLE4', 'https://kactus.com/blog/wp-content/uploads/2018/02/54_laffitte_club_confair_vivaldi.jpg', 500, 'Salle de Conférence', NULL, NULL),
(71, 7, 'rue tachfine', b'0', 'Salle 5', 'https://blog.1001salles.com/wp-content/uploads/2015/04/preparer-sa-salle.jpg', 250, 'Salle de Réunion', NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `type_salle`
--

CREATE TABLE `type_salle` (
  `id_type` bigint(20) NOT NULL,
  `nom_type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

CREATE TABLE `utilisateurs` (
  `id_utilisateurs` bigint(20) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `tele` varchar(255) DEFAULT NULL,
  `reservation1_id_reservation` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`id_utilisateurs`, `nom`, `prenom`, `tele`, `reservation1_id_reservation`, `email`, `password`) VALUES
(42, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(43, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(44, NULL, NULL, NULL, NULL, NULL, NULL),
(45, NULL, NULL, NULL, NULL, NULL, NULL),
(46, NULL, NULL, NULL, NULL, NULL, NULL),
(47, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(48, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(49, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(50, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(51, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(52, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(53, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(54, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(55, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL),
(56, 'MARWA', 'ELOMARI', '0676767676', NULL, 'elomarimaryame@gmail.com', NULL);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `paiement`
--
ALTER TABLE `paiement`
  ADD PRIMARY KEY (`id_paiment`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id_reservation`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`id_salle`),
  ADD KEY `FK6nihqigjj1mtfteu9gd84cu20` (`reservation2_id_reservation`),
  ADD KEY `FKfjyjivm3kckx42m3t1pu0x3i7` (`type_salle_id_type`);

--
-- Index pour la table `type_salle`
--
ALTER TABLE `type_salle`
  ADD PRIMARY KEY (`id_type`);

--
-- Index pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  ADD PRIMARY KEY (`id_utilisateurs`),
  ADD KEY `FK2629rfhake9k40gaxthisem2e` (`reservation1_id_reservation`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `paiement`
--
ALTER TABLE `paiement`
  MODIFY `id_paiment` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id_reservation` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `id_salle` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=72;

--
-- AUTO_INCREMENT pour la table `type_salle`
--
ALTER TABLE `type_salle`
  MODIFY `id_type` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  MODIFY `id_utilisateurs` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=57;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `salle`
--
ALTER TABLE `salle`
  ADD CONSTRAINT `FK6nihqigjj1mtfteu9gd84cu20` FOREIGN KEY (`reservation2_id_reservation`) REFERENCES `reservation` (`id_reservation`),
  ADD CONSTRAINT `FKfjyjivm3kckx42m3t1pu0x3i7` FOREIGN KEY (`type_salle_id_type`) REFERENCES `type_salle` (`id_type`);

--
-- Contraintes pour la table `utilisateurs`
--
ALTER TABLE `utilisateurs`
  ADD CONSTRAINT `FK2629rfhake9k40gaxthisem2e` FOREIGN KEY (`reservation1_id_reservation`) REFERENCES `reservation` (`id_reservation`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
