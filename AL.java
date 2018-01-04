import java.awt.*;
import java.awt.event.*;
import java.io.*;

import javax.sound.sampled.*;

import sun.audio.*;

public class AL extends Frame implements WindowListener,ActionListener {
	
		private static final long serialVersionUID = 1L; // default serial ID
		Button a, b, c, d, e, f, g, h, i, j;
		Battle battle = new Battle();

        public static void main(String[] args) {

                AL myWindow = new AL("Pokemon Battle");
                myWindow.setSize(800,480);
                myWindow.setVisible(true);
        }
        
        public AL(String title, boolean x)
        {
        	super(title);
        	setSize(800,480);
        	setVisible(true);
        }

        public AL(String title) {

                super(title);
                setLayout(new FlowLayout());
                addWindowListener(this);
                a = new Button("Attack 1");
                b = new Button("Attack 2");
                c = new Button("Special Attack 1");
                d = new Button("Special Attack 2");
                e = new Button("Pkmn 1");
                f = new Button("Pkmn 2");
                g = new Button("Pkmn 3");
                h = new Button("Pkmn 4");
                i = new Button("Pkmn 5");
                j = new Button("Pkmn 6");
                add(a);
                add(b);
                add(c);
                add(d);
                add(e);
                add(f);
                add(g);
                add(h);
                add(i);
                add(j);
                a.addActionListener(this);
                b.addActionListener(this);
                c.addActionListener(this);
                d.addActionListener(this);
                e.addActionListener(this);
                f.addActionListener(this);
                g.addActionListener(this);
                h.addActionListener(this);
                i.addActionListener(this);
                j.addActionListener(this);
        }
        
        public void paint(Graphics g)
        {
        	super.paintComponents(g);
        	g.drawImage(battle.scene, 0, 0, null);
        	g.drawImage(battle.cpu.get_front(), 550, 75, null);
        	g.drawImage(battle.player.get_back(), 75, 200, null);
        }
        
        public void music2()
        {
        	 AudioInputStream inputStream = null;
			try {
				inputStream = AudioSystem.getAudioInputStream(new File("battle_music.wav"));
			} catch (UnsupportedAudioFileException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
             Clip clip = null;
			try {
				clip = AudioSystem.getClip();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
             try {
				clip.open(inputStream);
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
             clip.loop(Clip.LOOP_CONTINUOUSLY);
             
        }
        
        public void music() 
        {       
        	String s = "battle_music.wav";
        	
        	AudioPlayer MGP = AudioPlayer.player;
            AudioStream BGM;
            AudioData MD;
            ContinuousAudioDataStream loop = null;

            try
            {
                InputStream test = new FileInputStream(s);
                BGM = new AudioStream(test);
                AudioPlayer.player.start(BGM);
                MD = BGM.getData();
                loop = new ContinuousAudioDataStream(MD);

            }
            catch(FileNotFoundException e){
                System.out.println("File not found error.");
            }
            catch(IOException error)
            {
                System.out.println("IO exception error.");
            }
            MGP.start(loop);
        }


        public void actionPerformed(ActionEvent e) {
        	// huge if block
               
               if (e.getActionCommand().equals("Attack 1"))
               {
            	   if (battle.player.hp > 0 && battle.cpu.hp > 0)
            	   {
	            	   if (battle.player.speed > battle.cpu.speed)
	            	   {
	            		   battle.atk1_call();
	            		   if (battle.cpu.hp > 0)
	            		   {
	            			   battle.cpu_attack();
	            			   if (battle.player.hp <= 0)
	            			   {
	            				   System.out.println(battle.player.name + " fainted!");
	            				   battle.check_loss();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.cpu.name + " fainted!");
	            			   battle.cpu_switch();
	            			   repaint();
	            		   }
	            	   }
	            	   else
	            	   {
	            		   battle.cpu_attack();
	            		   if (battle.player.hp > 0)
	            		   {
	            			   battle.atk1_call();
	            			   if (battle.cpu.hp <= 0)
	            			   {
	            				   System.out.println(battle.cpu.name + " fainted!");
	            				   battle.cpu_switch();
	            				   repaint();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.player.name + " fainted!"); 
	            			   battle.check_loss();
	            		   }
	            	   }
            	   }
               }
               
               if (e.getActionCommand().equals("Attack 2"))
               {
            	   if (battle.player.hp > 0 && battle.cpu.hp > 0)
            	   {
	            	   if (battle.player.speed > battle.cpu.speed)
	            	   {
	            		   battle.atk2_call();
	            		   if (battle.cpu.hp > 0)
	            		   {
	            			   battle.cpu_attack();
	            			   if (battle.player.hp <= 0)
	            			   {
	            				   System.out.println(battle.player.name + " fainted!");
	            				   battle.check_loss();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.cpu.name + " fainted!");
	            			   battle.cpu_switch();
	            			   repaint();
	            		   }
	            	   }
	            	   else
	            	   {
	            		   battle.cpu_attack();
	            		   if (battle.player.hp > 0)
	            		   {
	            			   battle.atk2_call();
	            			   if (battle.cpu.hp <= 0)
	            			   {
	            				   System.out.println(battle.cpu.name + " fainted!");
	            				   battle.cpu_switch();
	            				   repaint();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.player.name + " fainted!"); 
	            			   battle.check_loss();
	            		   }
	            	   }
            	   }
               }
               
               if (e.getActionCommand().equals("Special Attack 1"))
               {
            	   if (battle.player.hp > 0 && battle.cpu.hp > 0)
            	   {
	            	   if (battle.player.speed > battle.cpu.speed)
	            	   {
	            		   battle.atk3_call();
	            		   if (battle.cpu.hp > 0)
	            		   {
	            			   battle.cpu_attack();
	            			   if (battle.player.hp <= 0)
	            			   {
	            				   System.out.println(battle.player.name + " fainted!");
	            				   battle.check_loss();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.cpu.name + " fainted!");
	            			   battle.cpu_switch();
	            			   repaint();
	            		   }
	            	   }
	            	   else
	            	   {
	            		   battle.cpu_attack();
	            		   if (battle.player.hp > 0)
	            		   {
	            			   battle.atk3_call();
	            			   if (battle.cpu.hp <= 0)
	            			   {
	            				   System.out.println(battle.cpu.name + " fainted!");
	            				   battle.cpu_switch();
	            				   repaint();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.player.name + " fainted!"); 
	            			   battle.check_loss();
	            		   }
	            	   }
            	   }
               }
               
               if (e.getActionCommand().equals("Special Attack 2"))
               {
            	   if (battle.player.hp > 0 && battle.cpu.hp > 0)
            	   {
	            	   if (battle.player.speed > battle.cpu.speed)
	            	   {
	            		   battle.atk4_call();
	            		   if (battle.cpu.hp > 0)
	            		   {
	            			   battle.cpu_attack();
	            			   if (battle.player.hp <= 0)
	            			   {
	            				   System.out.println(battle.player.name + " fainted!");
	            				   battle.check_loss();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.cpu.name + " fainted!");
	            			   battle.cpu_switch();
	            			   repaint();
	            		   }
	            	   }
	            	   else
	            	   {
	            		   battle.cpu_attack();
	            		   if (battle.player.hp > 0)
	            		   {
	            			   battle.atk4_call();
	            			   if (battle.cpu.hp <= 0)
	            			   {
	            				   System.out.println(battle.cpu.name + " fainted!");
	            				   battle.cpu_switch();
	            				   repaint();
	            			   }
	            		   }
	            		   else
	            		   {
	            			   System.out.println(battle.player.name + " fainted!"); 
	            			   battle.check_loss();
	            		   }
	            	   }
            	   }
               }
               
               if (e.getActionCommand().equals("Pkmn 1"))
               {
            	   if (battle.user.get(0).hp > 0 && battle.cpu.hp > 0)
            	   {
            		   battle.switch1();
            		   repaint();
            	   }
               }
               
               if (e.getActionCommand().equals("Pkmn 2"))
               {
            	   if (battle.user.get(1).hp > 0 && battle.cpu.hp > 0)
            	   {
            		   battle.switch2();
            		   repaint();
            	   }
               }
               
               if (e.getActionCommand().equals("Pkmn 3"))
               {
            	   if (battle.user.get(2).hp > 0 && battle.cpu.hp > 0)
            	   {
            		   battle.switch3();
            		   repaint();
            	   }
               }
               
               if (e.getActionCommand().equals("Pkmn 4"))
               {
            	   if (battle.user.get(3).hp > 0 && battle.cpu.hp > 0)
            	   {
            		   battle.switch4();
            		   repaint();
            	   }
               }
               
               if (e.getActionCommand().equals("Pkmn 5"))
               {
            	   if (battle.user.get(4).hp > 0 && battle.cpu.hp > 0)
            	   {
            		   battle.switch5();
            		   repaint();
            	   }
               }
               
               if (e.getActionCommand().equals("Pkmn 6"))
               {
            	   if (battle.user.get(5).hp > 0 && battle.cpu.hp > 0)
            	   {
            		   battle.switch6();
            		   repaint();
            	   }
               }


        }

        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) 
        {
        	music2();
        	System.out.println("Welcome to Pokemon Battle!");
        	System.out.println("Your team of Pokemon (1-6) is:");
        	int count = 1;
        	for (Pokemon x : battle.user)
        	{
        		System.out.println();
        		System.out.println("Pokemon #" + count + ":");
        		System.out.println(x.statline());
        		System.out.println(x.disp_atks());
        		count++;
        	}
        	System.out.println("\nBattle start!");
        	System.out.println("You sent out " + battle.player.name +"!");
        	System.out.println("CPU sent out " + battle.cpu.name + "!");
        	repaint();
        }
        
        // unimplemented requisites
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}