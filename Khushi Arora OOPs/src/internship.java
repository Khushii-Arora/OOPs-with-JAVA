import java.util.Scanner;
public class internship {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
int sum=0;
	System.out.println("Enter initial position: ");
	int initialPos = s.nextInt();
	
	System.out.println("value of fixed Moves: ");
	int fixedMoves = s.nextInt();
	
	System.out.println("Enter no. of time jump is pressed: ");
	int N = s.nextInt();
	
	int[] Pos = new int[N]; //to story value after every jump in variable Pos
	Pos[0]=initialPos;//setting initial position

	for (int i=1; i<N; i++) {
	
		sum=Pos[i-1]+fixedMoves;

		Pos[i] = sum;
		
		}
	
	for (int i=0; i<N; i++) {
	System.out.println("jump "+ (i+1) +":"+Pos[i]);
	}
	s.close();
	}
	}
