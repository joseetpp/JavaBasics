import java.util.Scanner;

public class CovidTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tens febre? (sí/no):");
        String febra = sc.nextLine();

        if(febra.equalsIgnoreCase("si") || febra.equalsIgnoreCase("sí")){
            System.out.println("També tens tos? (sí/no):");
            String tos = sc.nextLine();
            
            if(tos.equalsIgnoreCase("si") || tos.equalsIgnoreCase("sí")){
                System.out.println("Et sents cansat o dèbil? (sí/no):");
                String cansat = sc.nextLine();
                
                if(cansat.equalsIgnoreCase("si") || cansat.equalsIgnoreCase("sí")){
                    System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
                } else {
                    System.out.println("Tens dificultat per respirar? (sí/no):");
                    String respirar = sc.nextLine();
                    
                    if(respirar.equalsIgnoreCase("si") || respirar.equalsIgnoreCase("sí")){
                        System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
                    } else {
                        System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
                    }
                }
            } else {
                System.out.println("Tens mal de coll o mal de cap? (sí/no):");
                String coll = sc.nextLine();
                
                if(coll.equalsIgnoreCase("si") || coll.equalsIgnoreCase("sí")){
                    System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
                } else {
                    System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
                }
            }

        } else {
            System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
            String olfacte = sc.nextLine();
            
            if(olfacte.equalsIgnoreCase("si") || olfacte.equalsIgnoreCase("sí")){
                System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
            } else {
                System.out.println("Tens congestió nasal o mocs? (sí/no):");
                String congestio = sc.nextLine();
                
                System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
            }
        }

        sc.close();
    }
}