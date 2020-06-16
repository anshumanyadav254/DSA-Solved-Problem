import java.util.Scanner;

// consider an arrangement where n pertol pumps are arranged in circular manner we need to find first
// petrol pump from where we visit all petrol pumps and come back to that petrol pump without ever going out of petrol

// petrol pumps's numbering are started by  1

public class FirstCircularTour {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		int Petrol[]=new int[n];
		int Distance[]=new int[n];
		for(int i=0;i<n;i++){
			Petrol[i]=sc.nextInt();

		}
		for(int i=0;i<n;i++){

			Distance[i]=sc.nextInt();
		}
		System.out.println(FirstPetrolPumpNaive(Petrol,Distance,n));
		System.out.println(FirstPertolEff(Petrol,Distance,n));

	}
	static int FirstPetrolPumpNaive(int pet[],int dist[],int n){
		for(int start=0;start<n;start++){
			int curr_petrol=0;
			int end=start;
			while (true){
				curr_petrol+=pet[end]-dist[end];
				if(curr_petrol<0){
					break;
				}
				end=(end+1)%n;
				if(end==start){
					return start+1;
				}
			}
		}
		return -1;

	}
	static  int FirstPertolEff(int petrol[],int dist[],int n){
		int start=0;int curr_pet=0;
		int prev_pet=0;
		for(int i=0;i<n;i++)
		{
			curr_pet+=petrol[i]-dist[i];
			if(curr_pet<0){
				start=i+1;
				prev_pet=curr_pet;
				curr_pet=0;
			}
		}

		return ((curr_pet+prev_pet)>=0)?(start+1):-1;
	}
}
