import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public static void main(String[] args) {
		World fly = new World();
		Bug zz = new Bug();

		Location where = new Location(1, 3);
		fly.add(where, zz);
		Bug zzz = new Bug();
		zzz.setColor(Color.BLUE);
		Location what = new Location(3, 5);
		fly.add(what, zzz);
		zzz.turn();
		zzz.turn();
		Flower lily = new Flower();
		Location ha = new Location(3, 6);
		Location bob = new Location(3, 4);
		fly.add(ha, lily);
		fly.add(bob, lily);
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < 10; i++) {
				Location l = new Location(i, j);
				Bug b = new Bug();
				fly.add(l, b);
				Random r = new Random();
				b.setColor(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
			}
		}

		fly.show();

	}
}
