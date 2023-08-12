package numberguessinggame;
import javax.swing.*;
public class numberguess {
	public static void main(String[] args) {
		int num=(int)(Math.random()*100+1);
		int user=0;
		System.out.println("The Correct guessing number whould be:"+num);
		int count=1;
		while(user!=num)
		{
			String response=JOptionPane.showInputDialog(null,"Enter a guess between 1 to 100","Guessing Game",3);
			user=Integer.parseInt(response);
			JOptionPane.showMessageDialog(null," "+determineguess(user,num,count));
		}
	}
	
	public static String determineguess(int user,int num,int count)
	{
		if(user<=0 || user>100)
		{
			return "your guess is invalid";
		}
		else if(user==num)
		{
			return "Correct ! \n Total Guesses :"+count;
		}
		
		else if(user>num)
		{
			return "Your guess is too high try again ,\n try number:"+count;
		}
		
		else if(user<num)
		{
			
			return "Your guess is too low try again ,\n try number:"+count;
		}
		
		else 
		{
			return "your guess is invalid \n try number"+count;
		}
	}

}
