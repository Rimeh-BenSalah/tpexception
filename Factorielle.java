package tpexception;

public class Factorielle {
	
	public static void main(String[] args) {
		int i, nbEntiers=0, factorielle=1;
		int ancien;
		try 
		{
			nbEntiers= Integer.parseInt(args[0]);
			if (nbEntiers<-1) {
				throw new Fact(("la factorielle d'un nombre négatif n'est pas définie"));
		}
			if (nbEntiers>20) {
				throw new Fact1(("la factorielle d'un nombre doit etre supérieur à 20"));
		}
		}
		catch (NumberFormatException s){
			System.out.println("La base de la factorielle doit être ENTIERE");
		}
		catch (ArrayIndexOutOfBoundsException s){
			System.out.println("Donnez en paramètre la base de la factorielle");
		}
		catch (Fact s){
			System.out.println(s.getMessage());
		}
		catch (Fact1 m){
			System.out.println(m.getMessage());
		}
		for (i=2;i<= nbEntiers;i++)
		 {
			 ancien=factorielle;
			 factorielle *= i;
		 }
		 System.out.println(" Voila la factorielle des "+ nbEntiers +
		 " premiers entiers : "+factorielle);
	}

}

