
public class MatchParens {

	public static void main(String[] args) {
		System.out.println(solution("( ( ) ) ( )"));
		System.out.println(solution("(()(())())"));
	}
	
	public static int solution(String s)
	{
		s = s.replace(" ", "");
		System.out.println("string after replace spaces: " + s);
		if (s.length()%2 != 0)
		{
			System.out.println("string has odd length");
			return 0;
		}
		else
		{
			while (s.contains("()"))
					s = s.replace("()", "");
			
			System.out.println("string after replace: " + s);
			if (s.length() == 0)
				return 1;
			else 
				return 0;
		}
		
		
	}

}
