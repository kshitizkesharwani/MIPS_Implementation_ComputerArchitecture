package computer_architecture_mips_implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.IgnoredErrorType;

public class Decision<K> {



	List<Instructions> inst ;


	public List<Instructions> makeDecision(List list) throws IOException {
		for ( int i = 0 ; i <list.size(); i ++ ) 			
		{
			inst= list;
			



			switch (inst.get(i).getInstName()) {


			case "ADD": 

				int j = 0; 


				if (i<=3 ) {
					for (j=i-1;j>=0;j--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");

							inst.get(i).setComments("Need Stalls");
							if ( i-j == 1)
							{ inst.get(i).setNumStalls(2);
							//instFU.get(i).setNumStalls(1);
							}

							if ( i-j ==2)

							{ inst.get(i).setNumStalls(1); 
							//instFU.get(i).setNumStalls(0);
							}



							break;
						}

					}	

				} 

				else if ( i > 3){
					for (j=i-1;j>=i-2;j--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							inst.get(i).setComments("Need Stalls");
							if ( i-j == 1)
							{ inst.get(i).setNumStalls(2);
							//instFU.get(i).setNumStalls(1);
							}

							if ( i-j ==2)

							{ inst.get(i).setNumStalls(1);
							//instFU.get(i).setNumStalls(0);
							}
							break;

						}

					}	 

				}


				break;

			case "SUB": 

				int j1; 

				if (i<=3 ) {
					for (j1=i-1;j1>=0;j1--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j1).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j1).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j1).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j1).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							inst.get(i).setComments("Need Stalls");
							if ( i-j1 == 1)
							{ inst.get(i).setNumStalls(2);
							//instFU.get(i).setNumStalls(1);
							}

							if ( i-j1 ==2)

							{ inst.get(i).setNumStalls(1); 
							//instFU.get(i).setNumStalls(0);
							}
							break;
						}

					}	 
				} 

				else if ( i > 3){
					for (j1=i-1;j1>=i-2;j1--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j1).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j1).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j1).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j1).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							inst.get(i).setComments("Need Stalls");
							if ( i-j1 == 1)
							{ inst.get(i).setNumStalls(2);
							//instFU.get(i).setNumStalls(1);
							}

							if ( i-j1 ==2)

							{ inst.get(i).setNumStalls(1);
							//instFU.get(i).setNumStalls(0);
							}
							break;

						}

					}	 

				}

				break;

			case "LOAD": 

				int j2; 

				if (i<=3 ) {
					for (j2=i-1;j2>=0;j2--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j2).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j2).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j2).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j2).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							inst.get(i).setComments("Need Stalls");
							if ( i-j2 == 1)
							{ inst.get(i).setNumStalls(2);
							//instFU.get(i).setNumStalls(1);
							}

							if ( i-j2 ==2)

							{ inst.get(i).setNumStalls(1); 
							//instFU.get(i).setNumStalls(0);
							}
							break;
						}

					}	 
				} 

				else if ( i > 3){
					for (j2=i-1;j2>=i-2;j2--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j2).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j2).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j2).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j2).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							if ( i-j2 == 1)
							{ inst.get(i).setNumStalls(2);
							//instFU.get(i).setNumStalls(1);
							}

							if ( i-j2 ==2)

							{ inst.get(i).setNumStalls(1); 
							//instFU.get(i).setNumStalls(0);
							}
							break;

						}

					}	 

				}

				break;

			case "STORE": 

				int j3; 

				if (i<=3 ) {
					for (j3=i-1;j3>=0;j3--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j3).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j3).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j3).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j3).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							inst.get(i).setComments("Need Stalls");
							if ( i-j3 == 1)
								if ( i-j3 == 1)
								{ inst.get(i).setNumStalls(2);
								//instFU.get(i).setNumStalls(1);
								}

							if ( i-j3 ==2)

							{ inst.get(i).setNumStalls(1);
							//instFU.get(i).setNumStalls(0);
							}
							break;
						}

					}	 
				} 

				else if ( i > 3){
					for (j3=i-1;j3>=i-2;j3--) 

					{ 
						if (inst.get(i).getReg1().equalsIgnoreCase(inst.get(j3).getReg1()) ||
								inst.get(i).getReg2().equalsIgnoreCase(inst.get(j3).getReg2()) || inst.get(i).getReg1().equalsIgnoreCase(inst.get(j3).getReg2()) || inst.get(i).getReg2().equalsIgnoreCase(inst.get(j3).getReg1())) {

							System.out.println(inst.get(i).getInstName()  + " -- Need Stalls");
							inst.get(i).setComments("Need Stalls");
							if ( i-j3 == 1)
								if ( i-j3 == 1)
								{ inst.get(i).setNumStalls(2);
								//instFU.get(i).setNumStalls(1);
								}

							if ( i-j3 ==2)

							{ inst.get(i).setNumStalls(1); 
							//instFU.get(i).setNumStalls(0);
							}
							break;
							

						}

					}	 

				}

				break;

				/*
				 * default:
				 * 
				 * System.out.println("Skipping");
				 */
				
			}



		}


		return inst;
	}

}
