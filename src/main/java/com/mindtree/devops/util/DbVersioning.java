package com.mindtree.devops.util;

import org.flywaydb.core.Flyway;

public class DbVersioning {
	
	public void callflyway()
	{
		Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:mysql://23.97.49.22:3306/emporderdb","root","Welcome123");

        // Start the migration
        flyway.migrate();
	}

}
