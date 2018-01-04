/*
 * This is the abstract class that will be the parent of all Pokemon
 */

import java.util.Random;
import java.awt.image.BufferedImage;


public abstract class Pokemon 
{
	private Random gen = new Random();
	protected int type, hp = 500, atk, def, sp_atk, sp_def, speed;
	protected String name, atk1, atk2, atk3, atk4, typing;
	protected BufferedImage front = null, back = null;
	protected boolean userc = true;
	
	/*
	 * Type Numbers:
	 * 0 - Normal
	 * 1 - Fighting
	 * 2 - Flying
	 * 3 - Poison
	 * 4 - Ground
	 * 5 - Rock
	 * 6 - Bug
	 * 7 - Ghost
	 * 8 - Steel
	 * 9 - Fire
	 * 10 - Water
	 * 11 - Grass
	 * 12 - Electric
	 * 13 - Psychic
	 * 14 - Ice
	 * 15 - Dragon
	 * 16 - Dark
	 * 17 - Fairy
	 */
	
	// type matchup chart - double dimension array
	private final double[][] matchup = {
			{1,	1,	1,	1,	1,	0.5,	1,	0,	0.5,	1,	1,	1,	1,	1,	1,	1,	1,	1} , // 1
			{2,	1,	0.5,	0.5,	1,	2,	0.5, 0,	2,	1,	1,	1,	1,	0.5, 2,	1,	2,	0.5} , // 2
			{1, 2,	1,	1,	1,	0.5,	2,	1,	0.5,	1,	1,	2,	0.5,	1,	1,	1,	1,	1} , // 3
			{1,	1,	1,	0.5,	0.5,	0.5,	1,	0.5,	0,	1,	1,	2,	1,	1,	1,	1,	1,	2} , // 4 
			{1,	1,	0,	2,		1,	2,		0.5,	1,	2,	2,	1,	0.5,	2,	1,	1,	1,	1,	1} , // 5
			{1,	0.5,	2,	1,	0.5,	1,	2,	1,	0.5,	2,	1,	1,	1, 1,	2,	1,	1,	1} , // 6
			{1,	0.5,	0.5,	0.5,	1,	1,	1,	0.5,	0.5,	0.5,	1,	2,	1,	2,	1,	1,	2,	0.5} , // 7
			{0,	1,		1,		1,	1,	1,	1,	2,	1,		1,	1,	1,	1,	2,	1,	1,	0.5,	1} , // 8
			{1,	1,	1,	1,	1,	2,	1,	1,	0.5,	0.5,	0.5,	1,	0.5,	1,	2,	1,	1,	2} , // 9
			{1,	1,	1,	1,	1, 0.5, 	2,	1,	2,	0.5,	0.5,	2,	1,	1,	2,	0.5,	1,	1} , // 10
			{1,	1,	1,	1,	2,	2,	1,	1,	1,	2,	0.5,	0.5,	1,	1,	1,	0.5,	1,	1,} , // 11
			{1,	1, 0.5, 0.5, 2,	2,	0.5,	1,	0.5,	0.5,	2,	0.5,	1,	1,	1,	0.5,	1,	1} , // 12
			{1,	1,	2,	1,	0,	1,	1,	1,	1,	1,	2,	0.5,	0.5,	1,	1,	0.5,	1,	1} , // 13
			{1,	2,	1,	2,	1,	1,	1,	1,	0.5,	1,	1,	1,	1,		0.5,	1,	1,	0,	1} , // 14
			{1,	1,	2,	1,	2,	1,	1,	1,	0.5,	0.5,	0.5,	2,	1,	1,	0.5,	2,	1,	1} , // 15
			{1,	1,	1,	1,	1,	1,	1,	1,	0.5,	1,	1,	1,	1,	1,	1,	2,	1,	0} , // 16
			{1,	0.5,	1,	1,	1,	1,	1,	2,	1,	1,	1,	1,	1,	2,	1,	1,	0.5,	0.5} , // 17
			{1,	2,	1,	0.5,	1,	1,	1,	1,	0.5,	0.5,	1,	1,	1,	1,	1,	2,	2,	1} , // 18
	}; // end of matchup array
	
	/**
	 * Method to change hp value (+ / -)
	 * @param int h
	 */
	public void do_damage(int h)
	{
		hp -= h;
		System.out.println(name + "'s HP: " + hp);
	}
	
	/**
	 * Calculates the amount of damage an attack does
	 * @param a
	 * @param d
	 * @param type_a
	 * @param type_b
	 * @param base
	 * @return damage
	 */
	private int damage(int a, int d, int type_a, int type_d, int base)
	{
		double mod = (1.5 * (gen.nextInt(16) / 100.0 + 0.85) * matchup[type_a][type_d] );
		int damage = (int) (( 0.84 * (a/d) * base + 2) * mod);
		return damage;
	}
	
	//----------------------------------------------------
	// Get methods
	public BufferedImage get_front()
	{
		return front;
	}
	
	public BufferedImage get_back()
	{
		return back;
	}
	
	public int get_type()
	{
		return type;
	}
	
	public int get_hp()
	{
		return hp;
	}
	
	public int get_atk()
	{
		return atk;
	}
	
	public int get_def()
	{
		return def;
	}
	
	public int get_sp_atk()
	{
		return sp_atk;
	}
	
	public int get_sp_def()
	{
		return sp_def;
	}
	
	public int get_speed()
	{
		return speed;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public String get_typing()
	{
		return typing;
	}
	
	public String get_atk1()
	{
		return atk1;
	}
	
	public String get_atk2()
	{
		return atk2;
	}
	
	public String get_atk3()
	{
		return atk3;
	}
	
	public String get_atk4()
	{
		return atk4;
	}
	
	//------------------------------------------------------------
	
	public int atk1(int d, int type_d)
	{
		if (userc)
			System.out.println("\nYour " + name + " used " + atk1 + "!");
		else
			System.out.println("\nFoe " + name + " used " + atk1 + "!");
		return damage(atk, d, type, type_d, 50);
	}
	
	public int atk2(int d, int type_d)
	{
		if (userc)
			System.out.println("\nYour " + name + " used " + atk2 + "!");
		else
			System.out.println("\nFoe " + name + " used " + atk2 + "!");
		return damage(atk, d, type, type_d, 80);
	}
	
	public int sp_atk1(int sp_d, int type_d)
	{
		if (userc)
			System.out.println("\nYour " + name + " used " + atk3 + "!");
		else
			System.out.println("\nFoe " + name + " used " + atk3 + "!");
		return damage(sp_atk, sp_d, type, type_d, 40);
	}
	
	public int sp_atk2(int sp_d, int type_d)
	{
		if (userc)
			System.out.println("\nYour " + name + " used " + atk4 + "!");
		else
			System.out.println("\nFoe " + name + " used " + atk4 + "!");
		return damage(sp_atk, sp_d, type, type_d, 90);
	}
	
	public String disp_atks()
	{
		String atks = "\nAttacks:\n1 - " + atk1;
		atks += "\n2 - " + atk2;
		atks += "\n3 - " + atk3;
		atks += "\n4 - " + atk4;
		return atks;
	}
	
	/**
	 * Returns string output of all stats
	 * @return String stat
	 */
	public String statline()
	{
		String stat = "Name: " + name;
		stat += "\nAtk\tDef\tSpA\tSpD\tSpeed\tType\n";
		stat += atk + "\t" + def + "\t" + sp_atk + "\t" +
				sp_def + "\t" + speed + "\t" + typing;
		return stat;
	}

} // end of class
