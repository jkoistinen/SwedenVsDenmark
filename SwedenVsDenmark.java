import java.util.Scanner;

public class SwedenVsDenmark {

/*
Skriv ett program med variablerna:
goalsSweden
goalsDenmark

Programmet ska skriva ut "Sverige till EM!" OM:
Sverige vinner.
Oavgjort
Uddamålsförlust 2-3, 3-4 osv INTE 1-2

Annars skriv ut:
"Danmark till EM!"

Lägg till: SWE-DEN 1-2
Skriv ut: "Förlängning!"
*/

public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("Hur många mål fick Sverige ?");
int goalsSweden = scan.nextInt();
System.out.println("Hur många mål fick Danmark ?");
int goalsDenmark = scan.nextInt();
boolean isOvertime = false;

//Förlängning
if(goalsSweden == 1 && goalsDenmark == 2){
  System.out.println("Förlängning!");
  isOvertime = true;
}
//Oavgjort eller Sverige har gjort mer mål än Danmark
else if(goalsSweden == goalsDenmark || goalsSweden > goalsDenmark){
  System.out.println("Sverige till EM!");
}

//Uddamålsförlust 2-3, 3-4 osv. INTE 1-2
if(goalsSweden < goalsDenmark && isOvertime == false){
  int resultGame = goalsDenmark - goalsSweden;
  if(resultGame == 1){
    System.out.println("Uddamålsförlust Danmark!");
    System.out.println("Sverige till EM!");
  }
  //Danmark mer än 1 mål emot Sverige
  else if(goalsSweden < goalsDenmark) {
    System.out.println("Danmark till EM!");
  }
}

}
}
