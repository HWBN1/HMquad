package p;
public class scientific_events {

	String ans="";
	boolean bracket_open=false;
	boolean found_sign=false;
	scientific_calculation cal;
	matrix mat;
	public scientific_events()
	{
		cal=new scientific_calculation();
		mat=new matrix();
	}
	///////////////////////////////
	String matrix_event(String input,char ch)
	{
		if(Character.isDigit(ch)==true&&bracket_open)
		{
			input+=ch;
			return input;
		}
		else if((ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%'))
		{
			
			if(bracket_open=false&&!found_sign)
			{
				found_sign=true;
				input+=ch;
				return input;
			}
		}
		else if(ch=='y'&&!found_sign)
		{
			
			if(input.charAt(input.length()-1)==']')
			{
				found_sign=true;
				input+=".*";
				return input;
			}
		}
		else if(ch=='z'&&!found_sign)
		{
			if(input.charAt(input.length()-1)==']')
			{
				found_sign=true;
				input+="./";
				return input;
			}
		}
		else if(ch=='w')
		{
			if(input.charAt(input.length()-1)==']')
			{
				
				double d[][]=getmatrix(input.substring(1, input.length()-1));
				d=mat.transpose(d);
				input ="[";
				for(int i=0; i<d.length; ++i)
				{
					for(int j=0; j<d[0].length; ++j)
					{
						input+=String.valueOf(d[i][j]);
						if(j+1!=d[0].length)
						{
							input+=",";
						}
					}
					if(i+1!=d[0].length)
					{
						input+=";";
					}
				}
				input+="]";
				return input;
			}
		}
		else if(ch=='x')
		{
			if(input.charAt(input.length()-1)==']')
			{
				double d[][]=getmatrix(input.substring(1, input.length()-1));
				input =String.valueOf(mat.determinant(d));
				return input;
				
			}
		}
		else if(ch=='[')
		{
			if(input.equals(""))
			{
				bracket_open=true;
				input+=ch;
				return input;
			}
			char c=input.charAt(input.length()-1);
			if(c=='y'||c=='z'||c=='+'||c=='-'||c=='*'||c=='/'||c=='%')
			{
				bracket_open=true;
				input+=ch;
				return input;
			}
		}
		else if(ch==']')
		{
			if(bracket_open){
			
				bracket_open=false;
				input+=ch;
				return input;
			}
		}
		else if(ch==';' || ch==',')
		{
			if(bracket_open){
			
				
				input+=ch;
				return input;
			}
		}
		else if(ch=='=')
		{
			try {
					
				for(int i=0; i<input.length(); ++i)
				{
					char c=input.charAt(i);
					if(c=='+'||c=='*'||c=='-'||c=='%'||c=='+')
					{
						String s1=input.substring(0, i);
						String s2=input.substring(i+1, input.length());
						
						if(s1.contains("[")&&s2.contains("["))
						{
							double d1[][]=getmatrix(s1.substring(1, s1.length()-1));
							double d2[][]=getmatrix(s2.substring(1, s2.length()-1));
							double d[][];
							if(c=='+')
							{
								d=mat.add(d1, d2);
							}
							else if(c=='-')
							{
								d=mat.subtract(d1, d2);
							}
							else if(c=='*')
							{
								d=mat.multiply(d1, d2);
							}
							else if(c=='/')
							{
								d=mat.div(d1, d2);
							}
							else 
							{
								d=mat.mod(d1, d2);
							}
							input ="[";
							for(int ii=0; ii<d.length; ++ii)
							{
								for(int j=0; j<d[0].length; ++j)
								{
									input+=String.valueOf(d[ii][j]);
									if(j+1!=d[0].length)
									{
										input+=",";
									}
								}
								if(ii+1!=d[0].length)
								{
									input+=";";
								}
							}
							input+="]";
							return input;
						}
						
						if(s1.contains("[")&&s2.contains("[")==false)
						{
							double d1=Double.valueOf(s2.substring(1, s2.length()-1));
							double d2[][]=getmatrix(s1.substring(1, s1.length()-1));
							double d[][];
							if(c=='+')
							{
								d=mat.add(d2, d1);
							}
							else if(c=='-')
							{
								d=mat.add(d2, -d1);
							}
							else if(c=='*')
							{
								d=mat.multiply(d2,d1);
							}
							else if(c=='/')
							{
								d=mat.multiply(d2,1/d1);
							}
							else 
							{
								d=mat.mod( d2,d1);
							}
							input ="[";
							for(int ii=0; ii<d.length; ++ii)
							{
								for(int j=0; j<d[0].length; ++j)
								{
									input+=String.valueOf(d[ii][j]);
									if(j+1!=d[0].length)
									{
										input+=",";
									}
								}
								if(ii+1!=d[0].length)
								{
									input+=";";
								}
							}
							input+="]";
							return input;
						}
						if(s1.contains("[")==false&&s2.contains("[")==false)
						{
							double d1=Double.valueOf(s1.substring(1, s1.length()-1));
							double d2=Double.valueOf(s2.substring(1, s2.length()-1));
							
							if(c=='+')
							{
								input=String.valueOf(d1+d2);
							}
							else if(c=='-')
							{
								input=String.valueOf(d1-d2);
							}
							else if(c=='*')
							{
								input=String.valueOf(d1*d2);
							}
							else if(c=='/')
							{
								input=String.valueOf(d1/d2);
							}
							else
							{
								input=String.valueOf(d1%d2);
							}
						}
					}
					if(i+1!=input.length()&&c=='.'&&(input.charAt(i+1)=='/'||input.charAt(i+1)=='*'))
					{

						String s1=input.substring(0, i);
						String s2=input.substring(i+2, input.length());
						
						if(input.charAt(i+1)=='*')
						{
							double d1[][]=getmatrix(s1.substring(1, s1.length()-1));
							double d2[][]=getmatrix(s2.substring(1, s2.length()-1));
							double d[][]=mat.dot(d1, d2);
							for(int ii=0; ii<d.length; ++ii)
							{
								for(int j=0; j<d[0].length; ++j)
								{
									input+=String.valueOf(d[ii][j]);
									if(j+1!=d[0].length)
									{
										input+=",";
									}
								}
								if(ii+1!=d[0].length)
								{
									input+=";";
								}
							}
							input+="]";
							return input;
						}
						else
						{double d1[][]=getmatrix(s1.substring(1, s1.length()-1));
						double d2[][]=getmatrix(s2.substring(1, s2.length()-1));
						double d[][]=mat.dot_div(d1, d2);
						for(int ii=0; ii<d.length; ++ii)
						{
							for(int j=0; j<d[0].length; ++j)
							{
								input+=String.valueOf(d[ii][j]);
								if(j+1!=d[0].length)
								{
									input+=",";
								}
							}
							if(ii+1!=d[0].length)
							{
								input+=";";
							}
						}
						input+="]";
						return input;}
					}
				}
			
			}
			catch (Exception ex){
				return "Error";
			}
		}
		else if(ch=='s')
		{
			int pos=0;
			char s=0;
			for(int i=0; i<input.length(); ++i)
			{
				char c=input.charAt(i);
				if(c=='*'||c=='/'||c=='%')
				{
					pos=i;
				}
				else if(c=='-'||c=='+')
				{
					pos=-i;
					s=c;
				}
			}
			 if(pos==0)
			{
				if(input.charAt(0)=='-')
					return input.substring(1, input.length());
				else
					return "-"+input;
			}
			else if(pos+1==input.length())
			{
			}
				
			else if(pos>0)
			{
				return input.substring(0,pos+1)+"-"+input.substring(pos+1,input.length());
			}
			else
			{
				pos*=-1;
				if(s=='+')
				{
					return input.substring(0,pos)+"-"+input.substring(pos+1,input.length());
				}
				else
				{
					if(input.charAt(pos-1)=='*'||input.charAt(pos-1)=='/'||input.charAt(pos-1)=='%')
					{
						return input.substring(0,pos)+input.substring(pos+1,input.length());
					}
					else
					{
						return input.substring(0,pos)+"+"+input.substring(pos+1,input.length());
					}
				}
			}
		}
		else if(ch=='a')
		{
			return "";
		}
		else if(ch=='d')
		{
			return input.substring(0,input.length()-1);
		}
		
		return input;
	}
	private double[][] getmatrix(String input) {
		// TODO Auto-generated method stub
		
		String [] X = input.split(";");
		double [][] M = new double[X.length][X[0].length()];
		for(int i=0 ; i<X.length ; i++)
		{
			String [] Z = X[i].split(",");
			for(int j=0 ; j<Z.length ; j++)
			{
				M[i][j] = Double.valueOf(Z[j]);
			}
		}
		return M;
	
	}
	
	String event(String input,char ch)
	{
		
			if(Character.isDigit(ch)==true || ch=='(')
			{
				input+=ch;	
				return input;
			}
           ////////////////////////////
            else if(ch=='l')
            {
              if(input.equals("")==false)
                {
                  char last=input.charAt(input.length()-1);
                  if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                	  return input+"log(";
                 
                }
              else
                  input="log(";
                
           }
         
            
    
                  else if(ch=='n')
               {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"ln(";
                       
                      }
                    else
                        input="ln(";
               }
			
                  else if(ch=='r')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"sqrt";
                       
                      }
                    else
                        input="sqrt";
                  }
                  else if(ch=='p')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"pi";
                       
                      }
                    else
                        input="pi";
                  }
			
                  else if(ch=='g')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"sin(";
                       
                      }
                    else
                        input="sin(";
                  }
			///
                  else if(ch=='G')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"sin-1";
                       
                      }
                    else
                        input="sin-1(";
                  }
			
			///
                  else if(ch=='F')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"cos(";
                       
                      }
                    else
                        input="cos";
                  }
			///
                  else if(ch=='C')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"cos-1(";
                       
                      }
                    else
                        input="cos-1";
                  }
			///
                  else if(ch=='f')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"F";
                       
                      }
                    else
                        input="F";
                  }
			///
                  else if(ch=='i')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"C";
                       
                      }
                    else
                        input="C";
                  }
			///
                  else if(ch=='t')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"tan(";
                       
                      }
                    else
                        input="tan(";
                  }
			///
                  else if(ch=='T')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"tan-1(";
                       
                      }
                    else
                        input="tan-1";
                  }
			///
                  else if(ch=='m')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"%";
                       
                      }
                    
                  }
			///
                  else if(ch=='p')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"^";
                       
                      }
                    
                  }
			///
                  else if(ch=='q')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"sq";
                       
                      }
                  }
                 
			///
                  else if(ch=='!')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(Character.isDigit(last)==true)
                      	  return input+"!";
                       
                      }
                    
                  }
             ///
                  else if(ch=='v')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"1/(";
                       
                      }
                    
                  }
                	  
         ///
                  else if(ch=='e')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"e^";
                       
                      }
                    
                  }
			
			///

                  else if(ch=='A')
                  {
                	  if(input.equals("")==false)
                      {
                        char last=input.charAt(input.length()-1);
                        if(last=='+'||last=='-'||last=='*'||last=='/'||last=='%'||last=='(')
                      	  return input+"abs(";
                       
                      }
                    else
                        input="abs(";
                  }
			
			
			////////////////////////
			else if(ch=='.')
			{
				int pos=0;
				for(int i=0; i<input.length(); ++i)
				{
					char c=input.charAt(i);
					if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%')
					{
						pos=i;									//pos of last sign
					}
				}
				for(  ; pos<input.length(); ++pos)
				{
					if(input.charAt(pos)=='.')
					{
						return input;
					}
				}
				return input+".";
					
			}
			else if(input.equals(""))
			{
				return "";
			}
			else if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
			{
				char c=input.charAt(input.length()-1);
				if(c=='+'||c=='-'||c=='*'||c=='/'||c=='%')
				{
					return input.substring(0, input.length()-1)+ch;
				}
				else 
				{		
					input+=ch;
					return input;
				}
			}
			
			else if(ch=='=')
			{
				try {
					ans=cal.solve(input);
					return input + "\n  "  + cal.solve(input);
				}
				catch (Exception ex){
					return "Error";
				}
			}
			else if(ch=='s')
			{
				int pos=0;
				char s=0;
				for(int i=0; i<input.length(); ++i)
				{
					char c=input.charAt(i);
					if(c=='*'||c=='/'||c=='%')
					{
						pos=i;
					}
					else if(c=='-'||c=='+')
					{
						pos=-i;
						s=c;
					}
				}
				 if(pos==0)
				{
					if(input.charAt(0)=='-')
						return input.substring(1, input.length());
					else
						return "-"+input;
				}
				else if(pos+1==input.length())
				{
				}
					
				else if(pos>0)
				{
					return input.substring(0,pos+1)+"-"+input.substring(pos+1,input.length());
				}
				else
				{
					pos*=-1;
					if(s=='+')
					{
						return input.substring(0,pos)+"-"+input.substring(pos+1,input.length());
					}
					else
					{
						if(input.charAt(pos-1)=='*'||input.charAt(pos-1)=='/'||input.charAt(pos-1)=='%')
						{
							return input.substring(0,pos)+input.substring(pos+1,input.length());
						}
						else
						{
							return input.substring(0,pos)+"+"+input.substring(pos+1,input.length());
						}
					}
				}
			}
			else if(ch=='c')
			{
				return "";
			}
			else if(ch=='Z')
			{
				return input + ans;
			}
			else if(ch=='d')
			{
				return input.substring(0,input.length()-1);
			}
			else if(ch==')')
			{
				int count=0;
				char c=' ';
				for(int i=0; i<input.length(); ++i)
				{
					c=input.charAt(i);
					if(c=='(')
						count++;
					else if(c==')')
						count--;
					
				}
				if(count>0 &&( c!='+' && c!='-' && c!='*' && c!='/' && c!='%'))
					input+=ch;
				return input;
				
				
			}
		return input;
	}
}