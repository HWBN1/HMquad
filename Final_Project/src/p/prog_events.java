package p;
public  class prog_events {
	
	public static String dec_to_bin(String s)
	{
		int n = Integer.valueOf(s);
		String B="";
		int x;
		while(n>0)
		{
			x = n%2;
			n /= 2;
			B = String.valueOf(x) + B;
		}
		return B;
	}
	public static String dec_to_oct(String s)
	{
		int n = Integer.valueOf(s);

		String B="";
		int x;
		while(n>0)
		{
			x = n%8;
			n /= 8;
			B = String.valueOf(x) + B;
		}
		return B;
	}
	public static String dec_to_hex(String s)
	{
		int n = Integer.valueOf(s);
		String B="";
		int x;
		while(n>0)
		{
			x = n%16;
			n /= 16;
			if(x>9) 
			{x-=10;  char c = (char) (x+'A'); B = String.valueOf(c) + B; }
			else B = String.valueOf(x) + B;
		}
		return B;
	}
	
	public static String bin_to_dec(String s)
	{
		int R = 0;
		for(int i=0 ; i<s.length() ; i++)
		{
			R +=(s.charAt(i)-'0')* Math.pow(2.0, s.length()-i-1);
		}
		return String.valueOf(R);
	}
	public static String oct_to_dec(String s)
	{
		int R = 0;
		for(int i=0 ; i<s.length() ; i++)
		{
			R +=(s.charAt(i)-'0')* Math.pow(8.0, s.length()-i-1);
		}
		return String.valueOf(R);
	}
	public static String hex_to_dec(String s)
	{
		int R = 0;
		for(int i=0 ; i<s.length() ; i++)
		{
			int c;
			if(s.charAt(i)>'9') c = s.charAt(i)-'A' + 10;
			else c = s.charAt(i)-'0';
			R +=c* Math.pow(16.0, s.length()-i-1);
		}
		return String.valueOf(R);	
		}

	public static String bin_to_oct(String s)
	{
		String D = bin_to_dec(s);
		String O = dec_to_oct(D);
		return O;
	}
	public static String bin_to_hex(String s)
	{
		String D = bin_to_dec(s);
		String H = dec_to_hex(D);
		return H;
	}
	public static String oct_to_bin(String s)
	{
		String D = oct_to_dec(s);
		String B = dec_to_bin(D);
		return B;
	}
	public static String oct_to_hex(String s)
	{
		String D = oct_to_dec(s);
		String H = dec_to_hex(D);
		return H;
	}
	public static String hex_to_bin(String s)
	{
		String D = hex_to_dec(s);
		String B = dec_to_bin(D);
		return B;
	}
	public static String hex_to_oct(String s)
	{
		String D = hex_to_dec(s);
		String O = dec_to_oct(D);
		return O;
	}

	public String AND (String A , String B , String base)
	{
		String AA="",BB="";
		if(base.equals("binary"))
		{
			AA = bin_to_dec(A);
			BB = bin_to_dec(B);
		}
		else if(base.equals("octal"))
		{
			AA = oct_to_dec(A);
			BB = oct_to_dec(B);
		}
		else if(base.equals("hex"))
		{
			AA = hex_to_dec(A);
			BB = hex_to_dec(B);
		}
		else
		{
			AA = A;
			BB = B;
		}
		if(AA.isEmpty() || BB.isEmpty()) return "0";
		int x = Integer.valueOf(AA) & Integer.valueOf(BB);
		String S = String.valueOf(x);
		if(base.equals("binary"))
		     return dec_to_bin(S);
		else if(base.equals("octal"))
			 return dec_to_oct(S);
		else if(base.equals("Hex"))
			 return dec_to_hex(S);
		else
		     return S;
		
	}

	public String OR (String A , String B , String base)
	{
		String AA="",BB="";
		if(base.equals("binary"))
		{
			AA = bin_to_dec(A);
			BB = bin_to_dec(B);
		}
		else if(base.equals("octal"))
		{
			AA = oct_to_dec(A);
			BB = oct_to_dec(B);
		}
		else if(base.equals("hex"))
		{
			AA = hex_to_dec(A);
			BB = hex_to_dec(B);
		}
		else
		{
			AA = A;
			BB = B;
		}
		if(AA.isEmpty() || BB.isEmpty()) return "0";
		int x = Integer.valueOf(AA) | Integer.valueOf(BB);
		String S = String.valueOf(x);
		if(base.equals("binary"))
		     return dec_to_bin(S);
		else if(base.equals("octal"))
			 return dec_to_oct(S);
		else if(base.equals("hex"))
			 return dec_to_hex(S);
		else
		     return S;
		
	}


	public String XOR (String A , String B , String base)
	{
		String AA="",BB="";
		if(base.equals("binary"))
		{
			AA = bin_to_dec(A);
			BB = bin_to_dec(B);
		}
		else if(base.equals("octal"))
		{
			AA = oct_to_dec(A);
			BB = oct_to_dec(B);
		}
		else if(base.equals("hex"))
		{
			AA = hex_to_dec(A);
			BB = hex_to_dec(B);
		}
		else
		{
			AA = A;
			BB = B;
		}
		if(AA.isEmpty() || BB.isEmpty()) return "0";
		int x = Integer.valueOf(AA) ^ Integer.valueOf(BB);
		String S = String.valueOf(x);
		if(base.equals("binary"))
		     return dec_to_bin(S);
		else if(base.equals("octal"))
			 return dec_to_oct(S);
		else if(base.equals("hex"))
			 return dec_to_hex(S);
		else
		     return S;
		
	}

	public String NOT(String A)
	{
		String R = "";
		for(int i=0 ; i<A.length() ; i++)
			if(A.charAt(i)=='1') R+='0';
			else R+='1';
		return R;
	}

}
