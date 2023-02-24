/**
 * Permet de créer différent type de sapins
 * @author BIZET Julien
 * 
*/
public class Sapins
{
    /**
     * permet de retourner une chaîne de caractères avec nb caractères car identiques
     * @param nb  nombre de caractères de la chaîne
     * @param car caractère constituant la chaîne
     * @return la chaîne de caractères de nb caractères car
     */
    public static String genererStringLigne (int nb, char car){
        String maLigne = "";
        int compteur = nb; 
        while (compteur > 0) {
            maLigne = maLigne + car;
            compteur = compteur - 1;
        }
        return maLigne; // A modifier
    }

     /**
     * permet de retourner une chaîne de caractères représentant le sapin plein demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin plein
     */
    public static String genererSapinPlein (int h){
        String monSapin = "";
        int compteur = h, nbEspace = h-1, nbEtoiles = 1;
        String retour = System.getProperty("line.separator");
        while (compteur > 0) {
            monSapin = monSapin + genererStringLigne(nbEspace, ' ');
            monSapin = monSapin + genererStringLigne(nbEtoiles, '*') + retour;
            nbEspace = nbEspace - 1;
            nbEtoiles = nbEtoiles + 2;
            compteur = compteur - 1;
            
        }

        return monSapin; // A modifier
    }
    /**
     * permet de retourner une chaîne de caractères représentant le sapin vide demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin vide
     */
    public static String genererSapinVide (int h){
        if(h == 1){
            return "*";
        }
        String monSapin = "";
        int compteur = h-2, nbEspace = h-1;
        monSapin = monSapin + genererStringLigne(nbEspace, ' ') + '*' + '\n';
        nbEspace = nbEspace - 1;
        int nbEspaceMilieu = 1;
        while (compteur > 0) {
            monSapin = monSapin + genererStringLigne(nbEspace, ' ') + '*' + genererStringLigne(nbEspaceMilieu, ' ') + '*' + '\n';
            compteur = compteur - 1;
            nbEspace = nbEspace - 1;
            nbEspaceMilieu = nbEspaceMilieu + 2;
            
        }
        monSapin = monSapin + genererStringLigne((h*2) - 1, '*');
        
        return monSapin;
    }
    /**
     * permet de retourner une chaîne de caractères représentant le sapin couché demandé
     * @param h  hauteur du sapin
     * @return la chaîne de caractères sapin couché
     */
    public static String genererSapinCouche (int largeur){
        String SapinCouche = "";
        int compteur = 0;
        while (compteur < largeur){
            SapinCouche = SapinCouche + genererStringLigne(compteur, '*') + '\n';
            compteur = compteur + 1;
        }
        while (compteur > 0){
            SapinCouche = SapinCouche + genererStringLigne(compteur, '*') + '\n';
            compteur = compteur - 1;
        }
        return SapinCouche;
    }
    /**
     * permet d'afficher l'ensemble des sapins d'une hauteur défini
     * @param h  hauteur des sapins
     * 
     */
    public static void testSapin (int h){
        System.out.println(genererSapinPlein(h));
        System.out.println(genererSapinVide(h));
        System.out.println(genererSapinCouche(h));
    }
    /**
     * permet de générer un string rempli d'étoiles
     * @param hauteur nombre de lignes générer
     * @param longueur nombre d'étoiles à la base
     * 
     */
    public static void genererStringMatriceEcranBarre(int hauteur, int longueur) {
        int nbZero = 0, nbZeroMilieu = longueur - 2, cpt = 0, milieu = (hauteur/ 2) + 1;
        String maMatrice = genererStringLigne(longueur + 2, '*') + '\n';
        while (cpt < milieu - 1) {
            if(cpt < (longueur/ 2) - 1){
                maMatrice = maMatrice + '*' + genererStringLigne(nbZero, '0') + '*' + genererStringLigne(nbZeroMilieu, '0') + '*' +genererStringLigne(nbZero, '0') + '*' + '\n';
                cpt = cpt + 1;
                nbZero = nbZero + 1;
                nbZeroMilieu = nbZeroMilieu - 2;
            } else{
                maMatrice = maMatrice + '*' + genererStringLigne(nbZero, '0') + '*' + genererStringLigne(nbZeroMilieu, '0') + '*' +genererStringLigne(nbZero, '0') + '*' + '\n';
                cpt = cpt + 1;
            }
            
        }
        while (cpt > 0) {
            if (cpt > (longueur/2) - 1){
                maMatrice = maMatrice + '*' + genererStringLigne(nbZero, '0') + '*' + genererStringLigne(nbZeroMilieu, '0') + '*' +genererStringLigne(nbZero, '0') + '*' + '\n';
                cpt = cpt -1;
            } else{
                nbZero = nbZero - 1;
                nbZeroMilieu = nbZeroMilieu + 2;
                maMatrice = maMatrice + '*' + genererStringLigne(nbZero, '0') + '*' + genererStringLigne(nbZeroMilieu, '0') + '*' +genererStringLigne(nbZero, '0') + '*' + '\n';
                cpt = cpt - 1 ;
            }
        }
        maMatrice = maMatrice + genererStringLigne(longueur + 2, '*') + '\n';
        System.out.println(maMatrice);

    }
    public static void main(String[] agrs){
        testSapin(5);
    }
}



