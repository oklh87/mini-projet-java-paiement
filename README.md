# 📄 Mini Projet Java POO : Paiement & Facturation

## 1️⃣ Description
Ce projet est une **application console en Java** permettant de gérer des factures et des paiements.  
Il utilise les concepts de **Programmation Orientée Objet (POO)** : héritage, encapsulation, exceptions personnalisées, DAO et sérialisation pour la persistance.

**Fonctionnalités principales :**
- Ajouter, supprimer et rechercher des factures  
- Payer une facture  
- Afficher toutes les factures  
- Persistance des données dans un fichier (`factures.dat`)  
- Gestion des erreurs avec des exceptions personnalisées  

---

## 2️⃣ Technologies utilisées
- **Langage :** Java  
- **Concepts :** POO, DAO, Exceptions personnalisées, Serializable  
- **IDE recommandé :** IntelliJ IDEA, Eclipse ou NetBeans  

---

## 3️⃣ Structure du projet

mini-projet-java-paiement/
│
├── src/
│ └── ma/fste/miniprojet/
│ ├── app/
│ │ └── Main.java
│ ├── dao/
│ │ ├── FactureDAO.java
│ │ └── FactureFileDAO.java
│ ├── exception/
│ │ └── FactureNonTrouveeException.java
│ ├── model/
│ │ ├── Transaction.java
│ │ ├── Facture.java
│ │ └── Paiement.java
│ ├── service/
│ │ └── FactureService.java
│ └── util/
│ └── ValidationUtil.java
└── factures.dat
---

