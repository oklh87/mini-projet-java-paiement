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

```text
mini-projet-java-paiement/
│
├── src/
│   └── ma/fste/miniprojet/
│       ├── app/
│       │   └── Main.java
│       ├── dao/
│       │   ├── FactureDAO.java
│       │   └── FactureFileDAO.java
│       ├── exception/
│       │   └── FactureNonTrouveeException.java
│       ├── model/
│       │   ├── Transaction.java
│       │   ├── Facture.java
│       │   └── Paiement.java
│       ├── service/
│       │   └── FactureService.java
│       └── util/
│           └── ValidationUtil.java
└── factures.dat

4️⃣ Instructions pour exécuter le projet
Étape 1 : Cloner le dépôt\

---
git clone https://github.com/oklh87/mini-projet-java-paiement.git
---

Étape 2 : Ouvrir le projet dans un IDE

   Importer le dossier comme projet Java

Étape 3 : Compiler et exécuter

Lancer la classe Main.java

Le menu console suivant apparaîtra :

--- MENU PAIEMENT & FACTURATION ---
1. Ajouter facture
2. Payer facture
3. Supprimer facture
4. Rechercher facture
5. Afficher factures
0. Quitter

----
Étape 4 : Tester les fonctionnalités

Ajouter des factures avec ID unique et montant positif

Payer, supprimer ou rechercher des factures

Afficher toutes les factures pour vérifier la persistance

5️⃣ Exemples d’utilisation

Ajouter une facture :
ID: 1
Client: Ahmed
Montant: 500
Payer une facture :
ID facture: 1
Facture payée avec succès
ID facture: 1
Facture payée avec succès
Afficher toutes les factures :
ID: 1 | Montant: 500.0 | Client: Ahmed | Payée: true
----
6️⃣ Fonctionnalités avancées

Gestion des exceptions personnalisées (FactureNonTrouveeException)

Persistance automatique des factures

Vérification des montants valides via ValidationUtil

Architecture claire Service / DAO / Model / App
