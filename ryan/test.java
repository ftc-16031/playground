
public class test {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 11 ; i++) {
			StringBuilder builder = new StringBuilder("");
			for  (int j=0; j < 20; j++) {
				if (((j == 10+i)|| (j==10-i)) && i < 5) 
					builder.append(i+1);
				else if (((j == 10+i-2)|| (j==10-i+2)) && i >= 5 && i <9)
					builder.append(i+1);
				else if (((j == 10+i-2)|| (j==10-i+2)) && i == 9)
					builder.append(i-9);
				else if ( j > 3 && j < 17 && j % 2 == 0 && i == 10)
					builder.append("V");
				else if ( j > 3 && j < 17 && j % 2 == 1 && i == 10)
					builder.append("A");
				else
					builder.append(" ");
			}
			System.out.println(builder.toString());
		}

	}

}
