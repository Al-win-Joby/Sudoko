import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

class trry extends JFrame implements ActionListener{
	 String  x ="Action listener";
	 JLabel nooutput,num00,num01,num02,num03,num10,num11,num12,num13,num20,num21,num22,num23,num30,num31,num32,num33;
	 JPanel panel=new JPanel();
	
	 JButton b0,b2,b1,b3,b4;
	 String value;
	 int count,trialvalue,row,column,nosolutionflag=0;
	 int num[][]=new int[6][6];
	  
	   public   void displaynosolution() {
	    	
	    	// JLabel labelheadingmodifier=new JLabel();
		   nooutput.setBounds(93, 25, 200, 40);
		   nooutput.setOpaque(true);
		   nooutput.setHorizontalAlignment(SwingConstants.CENTER);
		   nooutput.setFont(new Font("Arial", Font.PLAIN, 20));
		   nooutput.setText("Ooops..... No Solution");
		   nooutput.setForeground(Color.red);
	    
	    	nosolutionflag=1;
	    	//labelheadingmodifier.setText("No Solution");
	         panel.add(nooutput);
	        
	    	}
	    
	 
	 void buttonassigning(Object object) 
	 {
		 JLabel buttonverify= new JLabel();//buttonverify =corresponding label
		 
		
	        
		 count=count+1;
		 switch(count) {
		 case 1:buttonverify=num00;
		 		break;
		 		
		 case 2:buttonverify=num01;
	 		break;
	 		
		 case 3:buttonverify=num02;
	 		break;
	 		
		 case 4:buttonverify=num03;
	 		break;
	 		
		 case 5:buttonverify=num10;
	 		break;
	 		
		 case 6:buttonverify=num11;
	 		break;
	 		
		 case 7:buttonverify=num12;
	 		break;
	 		
		 case 8:buttonverify=num13;
	 		break;
	 		
		 case 9:buttonverify=num20;
	 		break;
	 		
		 case 10:buttonverify=num21;
	 		break;
	 		
		 case 11:buttonverify=num22;
	 		break;
	 		
		 case 12:buttonverify=num23;
	 		break;
	 		
		 case 13:buttonverify=num30;
	 		break;
	 		
		 case 14:buttonverify=num31;
	 		break;
	 		
		 case 15:buttonverify=num32;
	 		break;
	 		
		 case 16:buttonverify=num33;
	 		break;
		 }
		
		 if(object==b0) {
			 ( buttonverify).setText("0");
		 }
		 
		 else if(object==b1) {
			 ( buttonverify).setText("1");
		 }
		 else if(object==b2) {
			 ( buttonverify).setText("2");
		 }
		 
		 else if(object==b3) {
			 buttonverify.setText("3");
		 }
		 else
			 buttonverify.setText("4");
		 value= buttonverify.getText();
		 trialvalue = Integer.parseInt(value);
		 int fi,fj;
		 fi=count/4;
		 if(count%4==0) {
			 fi--;
			 fj=3;
		 }
		 else fj=count%4-1;
		 num[fi][fj]=trialvalue;
		
		 if(count==16) {
		    inputnumbers();
		 
		   if( solveSudoku(num, 0,0))
  		     print(num);
     
  	        else {
  		     
  		     displaynosolution();
  	        }
		
		 }
	 }
	 //////////////////////////////////////////////////////////////////////////////
	    /* A utility function to print grid */
	     void print(int[][] grid)
	    {
	    	JLabel printsolution = new JLabel();
	    	
	    	 nooutput.setBounds(93, 25, 200, 40);
			   nooutput.setOpaque(true);
			   nooutput.setHorizontalAlignment(SwingConstants.CENTER);
			   nooutput.setFont(new Font("Arial", Font.PLAIN, 20));
			   nooutput.setText("Success");
			   panel.add(nooutput);
	    	
	    	
	    	
	    
	    	
	        for ( int i = 0; i < N; i++) {
	            for ( int j = 0; j < N; j++)
	            {
	                System.out.print(grid[i][j] + " ");
	                switch(i) {
	                case 0:{
	                	    switch(j) {
	                	    case 0: printsolution=num00;
	                	    		printsolution.setText(grid[i][j]+""); 
	  		              
	                	    		panel.add(printsolution);
	                	    		printsolution.setText(grid[i][j]+""); 
	      	  		              
	                	    		panel.add(printsolution);
	                	    case 1: printsolution=num01;
	                	    		printsolution.setText(grid[i][j]+""); 
		  		              
	                	    		panel.add(printsolution);
	                	    case 2: printsolution=num02;
	                	    		printsolution.setText(grid[i][j]+""); 
		  		              
	                	    		panel.add(printsolution);
	                	    case 3: printsolution=num03;
	                	    		printsolution.setText(grid[i][j]+""); 
		  		              
	                	    		panel.add(printsolution);
	                	    }
	                	
	                		}
	                case 1:{
                	    switch(j) {
                	    case 0: printsolution=num10;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    case 1: printsolution=num11;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	     		break;
                	    case 2: printsolution=num12;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    case 3: printsolution=num13;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    }
                	
                		}
	                case 2:{
                	    switch(j) {
                	    case 0: printsolution=num20;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    case 1: printsolution=num21;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	     		break;
                	    case 2: printsolution=num22;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    case 3: printsolution=num23;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    
                	    		break;
                	    }
                	
                		}
	                case 3:{
                	    switch(j) {
                	    case 0: printsolution=num30;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    case 1: printsolution=num31;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	     		break;
                	    case 2: printsolution=num32;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    case 3: printsolution=num33;
                	    printsolution.setText(grid[i][j]+""); 
	  		              
        	    		panel.add(printsolution);
                	    		break;
                	    }
                	
                		}
	               

	                }
	               	               
	                
	            }
	           
	           
	        }
	       
	    }
	 
		 		 
	 	 
    public trry(){
        x="inside try const";
        
        
        
        panel.setLayout(null);
        getContentPane().add(panel);
        setSize(450,450);
        
       
       
       
        
        num00=new JLabel();
        num00.setBounds(100, 75, 40, 40);
        num00.setOpaque(true);
        num00.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num00);
        
        
        b0=new JButton("0");
        b0.setBounds(65, 300, 50, 50);
        panel.add(b0);
        b0.addActionListener(this);

        b1=new JButton("1");
        b1.setBounds(120, 300, 50, 50);
        panel.add(b1);
        b1.addActionListener(this);
        
        b2=new JButton("2");
        b2.setBounds(175, 300, 50, 50);
        panel.add(b2);
        b2.addActionListener(this);
        
        b3=new JButton("3");
        b3.setBounds(230, 300, 50, 50);
        panel.add(b3);
        b3.addActionListener(this);
        
        b4=new JButton("4");
        b4.setBounds(285, 300, 50, 50);
        panel.add(b4);
        b4.addActionListener(this);
        
        x="mid way in const";
        
        num01=new JLabel();
        num01.setBounds(150, 75, 40, 40);
        num01.setOpaque(true);
        num01.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num01);

        num02=new JLabel();
        num02.setBounds(200, 75, 40, 40);
        num02.setOpaque(true);
        num02.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num02);
        
        num03=new JLabel();
        num03.setBounds(250, 75, 40, 40);
        num03.setOpaque(true);
        num03.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num03);
        
        num10=new JLabel();
        num10.setBounds(100, 125, 40, 40);
        num10.setOpaque(true);
        num10.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num10);
        
        num11=new JLabel();
        num11.setBounds(150, 125, 40, 40);
        num11.setOpaque(true);
        num11.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num11);
        
        num12=new JLabel();
        num12.setBounds(200, 125, 40, 40);
        num12.setOpaque(true);
        num12.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num12);
        
        num13=new JLabel();
        num13.setBounds(250, 125, 40, 40);
        num13.setOpaque(true);
        num13.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num13);
        
        num20=new JLabel();
        num20.setBounds(100, 175, 40, 40);
        num20.setOpaque(true);
        num20.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num20);
        
        num21=new JLabel();
        num21.setBounds(150, 175, 40, 40);
        num21.setOpaque(true);
        num21.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num21);
        
        num22=new JLabel();
        num22.setBounds(200, 175, 40, 40);
        num22.setOpaque(true);
        num22.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num22);
        
        
        num23=new JLabel();
        num23.setBounds(250, 175, 40, 40);
        num23.setOpaque(true);
        num23.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num23);
        
        num30=new JLabel();
        num30.setBounds(100, 225, 40, 40);
        num30.setOpaque(true);
        num30.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num30);
        
        num31=new JLabel();
        num31.setBounds(150, 225, 40, 40);
        num31.setOpaque(true);
        num31.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num31);
        
        num32=new JLabel();
        num32.setBounds(200, 225, 40, 40);
        num32.setOpaque(true);
        num32.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num32);
        
        num33=new JLabel();
        num33.setBounds(250, 225, 40, 40);
        num33.setOpaque(true);
        num33.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(num33);
        
        nooutput=new JLabel();
		 
		 nooutput.setBounds(93, 25, 200, 40);
		 nooutput.setOpaque(true);
		 nooutput.setHorizontalAlignment(SwingConstants.CENTER);
		 //nooutput.setBackground(Color.gray);
		
         
		 panel.add(nooutput);
		 x="end of try const";
		 
      
       
       
    }
    
    
    //-------------------------------------------------////
    

    
    
    public void inputnumbers() //input numbers to display as JLable
    
   {	
    	 for(int i=0;i<4;i++) {
			 for(int j=0;j<4;j++) {
				 System.out.print(num[i][j]+" ");
			 }
			 
		 }         
    }
/////////////////////////////COPIED CODE/////////////////////////////////////////////////////
   
    
    static int N = 4;
    
    /* Takes a partially filled-in grid and attempts
    to assign values to all unassigned locations in
    such a way to meet the requirements for
    Sudoku solution (non-duplication across rows,
    columns, and boxes) */
    static boolean solveSudoku(int grid[][], int row,
                               int col)
    {
 
        /*if we have reached the 8th
           row and 9th column (0
           indexed matrix) ,
           we are returning true to avoid further
           backtracking       */
        if (row == N - 1 && col == N)
            return true;
 
        // Check if column value  becomes 9 ,
        // we move to next row
        // and column start from 0
        if (col == N) {
            row++;
            col = 0;
        }
 
        // Check if the current position
        // of the grid already
        // contains value >0, we iterate
        // for next column
        if (grid[row][col] != 0)
            return solveSudoku(grid, row, col + 1);
 
        for (int number = 1; number < 5; number++) {
 
            // Check if it is safe to place
            // the num (1-9)  in the
            // given row ,col ->we move to next column
            if (isSafe(grid, row, col, number)) {
 
                /*  assigning the num in the current
                (row,col)  position of the grid and
                assuming our assigned num in the position
                is correct */
                grid[row][col] = number;
 
                // Checking for next
                // possibility with next column
                if (solveSudoku(grid, row, col + 1))
                    return true;
            }
            /* removing the assigned num , since our
               assumption was wrong , and we go for next
               assumption with diff num value   */
            grid[row][col] = 0;
        }
        return false;
    }
 

    // Check whether it will be legal
    // to assign num to the
    // given row, col
    static boolean isSafe(int[][] grid, int row, int col,
                          int number)
    {
 
        // Check if we find the same num
        // in the similar row , we
        // return false
        for (int x = 0; x <= 3; x++)
            if (grid[row][x] == number)
                return false;
 
        // Check if we find the same num
        // in the similar column ,
        // we return false
        for (int x = 0; x <= 3; x++)
            if (grid[x][col] == number)
                return false;
 
        // Check if we find the same num
        // in the particular 3*3
        // matrix, we return false
        int startRow = row - row % 2, startCol
                                      = col - col % 2;
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                if (grid[i + startRow][j + startCol] == number)
                    return false;
 
        return true;
    }
    
    
    
    
    
    
//////////////////////////////////////////////////////////////////////////////    
    
    
    
    public void paint(Graphics g)
    {
        super.paint(g);  // fixes the immediate problem.
        
        x="in paint";
        
        Graphics2D g2 = (Graphics2D) g;
        Stroke stroke = new BasicStroke(3f);
        Stroke strokes = new BasicStroke(3f);
        
       
        for(int i=0;i<250;i=i+50) //hori
        {
        	        
        Line2D lin = new Line2D.Float(100,100+i,300,100+i);
        
        g2.draw(lin);
        
        }
              
        for(int i=0;i<250;i=i+50)  //vert
        {       	        
        Line2D lin = new Line2D.Float(100+i,100,100+i,300);       
        g2.draw(lin);
        }
        
        for(int i=0;i<250;i=i+100) {
            Line2D line = new Line2D.Float(100+i,100,100+i,300);
                g2.setStroke(strokes);
                 g2.draw(line);
            }
        for(int i=0;i<250;i=i+100) {
            Line2D lines = new Line2D.Float(100,100+i,300,100+i);
                g2.setStroke(stroke);
                 g2.draw(lines);
            }
        
       
    }

    public static void main(String []args){
        trry s=new trry();
        //s.display();
        
        //s.x="back to main";
        s.setVisible(true);
       
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			
			buttonassigning(e.getSource());
		
		
	//	
	}
}


