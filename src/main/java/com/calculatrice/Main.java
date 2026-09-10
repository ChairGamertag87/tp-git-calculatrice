package com.calculatrice;

/**
 * Point d'entrée de la calculatrice : affiche l'interface console.
 */
public class Main {

    private static final String LIGNE = "+" + "-".repeat(38) + "+";

    public static void main(String[] args) {
        afficherBanniere();
        afficherMenu();
    }

    /** Affiche le titre encadré de la calculatrice. */
    static void afficherBanniere() {
        System.out.println(LIGNE);
        System.out.println(centrer(""));
        System.out.println(centrer("C A L C U L A T R I C E"));
        System.out.println(centrer("TP Git - version 1.0"));
        System.out.println(centrer(""));
        System.out.println(LIGNE);
    }

    /** Affiche la liste des opérations disponibles. */
    static void afficherMenu() {
        System.out.println(ligne("Opérations disponibles :"));
        System.out.println(ligne(""));
        System.out.println(ligne("  [1]  Addition        a + b"));
        System.out.println(ligne("  [2]  Soustraction    a - b"));
        System.out.println(ligne(""));
        System.out.println(ligne("  [0]  Quitter"));
        System.out.println(LIGNE);
    }

    /** Retourne le texte centré dans une ligne encadrée. */
    static String centrer(String texte) {
        int largeur = LIGNE.length() - 2;
        int gauche = (largeur - texte.length()) / 2;
        int droite = largeur - texte.length() - gauche;
        return "|" + " ".repeat(gauche) + texte + " ".repeat(droite) + "|";
    }

    /** Retourne le texte aligné à gauche dans une ligne encadrée. */
    static String ligne(String texte) {
        int largeur = LIGNE.length() - 2;
        return "| " + texte + " ".repeat(Math.max(0, largeur - 1 - texte.length())) + "|";
    }
}
