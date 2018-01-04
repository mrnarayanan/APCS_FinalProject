import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.imageio.ImageIO;


public class Battle 
{
	public ArrayList<Pokemon> all = new ArrayList<Pokemon>();
	public ArrayList<Pokemon> user = new ArrayList<Pokemon>();
	public ArrayList<Pokemon> comp = new ArrayList<Pokemon>();
	public Pokemon player;
	public Pokemon cpu;
	Random gen = new Random();
	public BufferedImage scene = null;
	
	public Battle()
	{
		all = all_creator(all);
		user = team_builder(user);
		comp = team_builder(comp);
		for (Pokemon c : comp)
			c.userc = false;
		choose_scene();
		player = user.get(0); // assigns player their first pokemon
		cpu = comp.get(0); // assigns cpu its first pokemon

	}
	
	private void choose_scene()
	{
		int num = gen.nextInt(6);
		String[] list = { "Images/Pokemon_Beach.jpg", "Images/Pokemon_Fire.jpg" , "Images/Pokemon_Grass.jpg", 
							"Images/Pokemon_Space.jpg", "Images/Pokemon_Stadium.jpg", "Images/Pokemon_Water.jpg"};
		String pic = list[num];
		try {
    	    scene = ImageIO.read(new File(pic));
    	} 
    	catch (IOException e) {
    		System.out.println("Scene Error."); 
    	}
		
	}
	
	public void cpu_attack()
	{
		int a = gen.nextInt(4);
		switch (a) 
		{
			case 0: player.do_damage(cpu.atk1(player.def, player.type));
					break;
			case 1: player.do_damage(cpu.atk2(player.def, player.type));
					break;
			case 2: player.do_damage(cpu.sp_atk1(player.sp_def, player.type));
					break;
			case 3: player.do_damage(cpu.sp_atk2(player.sp_def, player.type));
					break;
			default: break;
		} // end of switch
	}
	
	public void check_loss()
	{
		int count = 0;
		label:
		for (Pokemon p : user)
		{
			if (p.hp > 0)
			{
				System.out.println("Choose another Pokemon.");
				break label;
			}
			else
				count++;
		}
		if (count == 6)
			System.out.println("You lose! You have no usable Pokemon left. Please close the game window.");	
	}
	
	public void cpu_switch()
	{
		int count = 0;
		label:
		for (Pokemon p : comp)
		{
			if (p.hp > 0)
			{
				cpu = p;
				System.out.println("\nCPU switched to: " + cpu.name);
				break label;
			}
			else
				count++;
		}
		if (count == 6)
			System.out.println("You win! CPU has no usable Pokemon left. Please close the game window.");	
	}
	
	public void switch1()
	{
		player = user.get(0);
		System.out.println("\nYou switched to: " + player.name);
	}
	
	public void switch2()
	{
		player = user.get(1);
		System.out.println("\nYou switched to: " + player.name);
	}
	
	public void switch3()
	{
		player = user.get(2);
		System.out.println("\nYou switched to: " + player.name);
	}
	
	public void switch4()
	{
		player = user.get(3);
		System.out.println("\nYou switched to: " + player.name);
	}
	
	public void switch5()
	{
		player = user.get(4);
		System.out.println("\nYou switched to: " + player.name);
	}
	
	public void switch6()
	{
		player = user.get(5);
		System.out.println("\nYou switched to: " + player.name);
	}
	
	public void atk1_call()
	{
		cpu.do_damage(player.atk1(cpu.def, cpu.type));
	}
	
	public void atk2_call()
	{
		cpu.do_damage(player.atk2(cpu.def, cpu.type));
	}
	
	public void atk3_call()
	{
		cpu.do_damage(player.sp_atk1(cpu.sp_def, cpu.type));
	}
	
	public void atk4_call()
	{
		cpu.do_damage(player.sp_atk2(cpu.sp_def, cpu.type));
	}
	
	private ArrayList<Pokemon> all_creator(ArrayList<Pokemon> all)
	{
		Accelgor accelgor = new Accelgor();
		all.add(accelgor);
		Ampharos ampharos = new Ampharos();
		all.add(ampharos);
		Avalugg avalugg = new Avalugg();
		all.add(avalugg);
		Espeon espeon = new Espeon();
		all.add(espeon);
		Florges florges = new Florges();
		all.add(florges);
		Haxorus haxorus = new Haxorus();
		all.add(haxorus);
		Klinklang klinklang = new Klinklang();
		all.add(klinklang);
		Liepard liepard = new Liepard();
		all.add(liepard);
		Machamp machamp = new Machamp();
		all.add(machamp);
		Marowak marowak = new Marowak();
		all.add(marowak);
		Milotic milotic = new Milotic();
		all.add(milotic);
		Mismagius mismagius = new Mismagius();
		all.add(mismagius);
		Rampardos rampardos = new Rampardos();
		all.add(rampardos);
		Sceptile sceptile = new Sceptile();
		all.add(sceptile);
		Snorlax snorlax = new Snorlax();
		all.add(snorlax);
		Swalot swalot = new Swalot();
		all.add(swalot);
		Tornadus tornadus = new Tornadus();
		all.add(tornadus);
		Typhlosion typhlosion = new Typhlosion();
		all.add(typhlosion);
		return all;
	}
	
	private ArrayList<Pokemon> team_builder(ArrayList<Pokemon> team)
	{
		int x = 0;
		for (int i = 0; i < 6; i++)
		{
			x = gen.nextInt(all.size());
			team.add(all.remove(x));
		}
		return team;	
	}
	
} // end of class
