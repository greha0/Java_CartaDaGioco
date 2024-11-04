
/**
 * Classe di una carta da gioco
 * 
 * @author Greta Maria Brugnatti 
 * @version 03/11/2024 
*/
public class CartaDaGioco
{
    private char valore;
    private char seme;
    private char coloreDorso;
    
    public String valoriValidi ="1,2,3,4,5,6,7,8,9,j,q,k";
    public String semiValidi = "q,p,c,f";
    public String coloriValidi = "b,r,g,v";

    /**
     * Costruttore dell'oggetto Carta Da Gioco
     * 
     * @param v        Valore della carte, valori validi --> {1,2,3,4,5,6,7,8,9,J,Q,K}
     * @param s        Seme della carta --> q,p,c,f
     * @param c        Colore del dorso della carta --> b(blu), r(rosso), g(giallo), v(verde)
     * 
     */
    public CartaDaGioco(char v, char s, char c)
    {
        if(valoriValidi.indexOf(Character.toLowerCase(v))==-1){
            throw new IllegalArgumentException("Impossibile creare l'oggetto. Controllare i valori inseriti");
        }
        if(semiValidi.indexOf(Character.toLowerCase(s))==-1){
            throw new IllegalArgumentException("Impossibile creare l'oggetto. Controllare i valori inseriti");
        }
        if(coloriValidi.indexOf(Character.toLowerCase(c))==-1){
            throw new IllegalArgumentException("Impossibile creare l'oggetto. Controllare i valori inseriti");
        }
        valore = Character.toLowerCase(v);
        seme = Character.toLowerCase(s);
        coloreDorso = Character.toLowerCase(c);
    }
    
    /**
     * Costruttore dell'oggetto Carta Da Gioco data la sigla della carta
     * 
     * @param stringaCarta   Stringa della carta con indicazioni indicate in questo modo : valoreSemeColore
     * 
     */
    public CartaDaGioco(String stringaCarta)
    {
        stringaCarta=stringaCarta.toLowerCase();
        valore = stringaCarta.charAt(0);
        seme = stringaCarta.charAt(1);
        coloreDorso = stringaCarta.charAt(2);
        
        if(valoriValidi.indexOf(valore)==-1 ){
            throw new IllegalArgumentException("Impossibile creare l'oggetto. Controllare i valori inseriti");
        }
        if(semiValidi.indexOf(seme)==-1){
            throw new IllegalArgumentException("Impossibile creare l'oggetto. Controllare i valori inseriti");
        }
        if(coloriValidi.indexOf(coloreDorso)==-1){
            throw new IllegalArgumentException("Impossibile creare l'oggetto. Controllare i valori inseriti");
        }
    }


    /**
     * Scrive in una stringa le informazioni della carta da gioco
     * 
     * @return     Ritorna la stringa con le informazioni
     * 
     */
    
    public String toString(){
        String stringa = "";
        //Valore
        if(valore == 'j'){
            stringa = "Fante ";
        }
        if(valore == 'q'){
            stringa = "Regina ";
        }
        if(valore == 'k'){
            stringa = "Re ";
        }else{
            stringa = stringa + valore + " ";
        }
        
        //Seme
        if(seme == 'q'){
            stringa = stringa + "di " + "Quadri ";
        }
        if(seme == 'f'){
            stringa = stringa + "di " + "Fiori ";
        }
        if(seme == 'p'){
            stringa = stringa + "di " + "Picche ";
        }
        if(seme == 'c'){
            stringa = stringa + "di " + "Cuori ";
        }
        
        //Colore del dorso
        
        if(coloreDorso == 'b'){
            stringa = stringa + "colore " + "blu"; 
        }
        if(coloreDorso == 'r'){
            stringa = stringa + "colore " + "rosso"; 
        }
        if(coloreDorso == 'g'){
            stringa = stringa + "colore " + "giallo"; 
        }
        if(coloreDorso == 'v'){
            stringa = stringa + "colore " + "verde"; 
        }
        
        return stringa;
    }
    /**
     * Prende il valore dell'oggetto
     * @return Valore dell'oggetto
     */
    public char getValore(){
        return valore;
    }
    
    /**
     * Prende il seme dell'oggetto
     * @return Seme dell'oggetto
     */
    public char getSeme(){
        return seme;
    }
    
    /**
     * Prende il colore del dorso dell'oggetto
     * @return Colore del dorso dell'oggetto
     */
    public char getColoreDorso(){
        return coloreDorso;
    }
    
    /**
     * Confronta con un'altra carta
     * @param carta Altro oggetto da confrontare con l'oggetto attuale
     */
    
    public void confronta(CartaDaGioco carta){
        char v1;
        char v2;
        
        v1 = valore;
        v2 = carta.getValore();
        
        if(v1 == 'j'){
            v1 = 58; //faccio finta che nel codice ascii esista il 10
        }
        
        if(v1 == 'q'){
            v1 = 59;
        }
        
        if(v1 == 'k'){
            v1 = 60;
        } 
        
        if(v2 == 'j'){
            v2 = 58; //faccio finta che nel codice ascii esista il 10
        }
        
        if(v2 == 'q'){
            v2 = 59;
        }
        
        if(v2 == 'k'){
            v2 = 60;
        }
        
        if(v1 == v2){
            if(carta.getSeme() == seme){
                if(carta.getColoreDorso() == coloreDorso){
                    System.out.println("Le carte sono uguali");
                } else {
                    System.out.println("Le carte hanno valore e seme uguale ma colore del dorso diverso");
                }
            } else {
                System.out.println("Le carte hanno valore uguale ma seme diverso");
            }
        }
        
        if(v1 > v2){
            System.out.println("La carta attuale è maggiore dell'altra carta");
        }
        
        if(v1<v2){
            System.out.println("La carta attuale è minore dell'altra carta");
        }
        
    }
   
}
