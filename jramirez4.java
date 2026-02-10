//Juan Ramirez
 /*
  * csc321
  * lab #4
  */

        import java.util.Scanner;

        public class jramirez4
        {
                public static void main(String[]args)
                {
                        Scanner message = new Scanner(System.in);
			

                        System.out.println("What kind of genre of movies you like horror, drama, comedy, or romance.");

                        String user = message.nextLine();

                if(user.equalsIgnoreCase("drama"))
                {
                        System.out.println("I see you enjoy drama I'm guessing alot of your favorite movies have oscar win or nominations.");
                }
                        if(user.equalsIgnoreCase("comedy"))
                        {
                                System.out.println("I see you have a funny bone I highly recommeded watching Harold & Kumar go to white castle.");

                        }
                                if(user.equalsIgnoreCase("horror"))
                                {
                                        System.out.println("Great we can be friends only if you say SCREAM is a good movie.");
                                }
                                        if(user.equalsIgnoreCase("romance"))
                                        {
                                                System.out.println("Im sorry not interested on going to the movies with you.");
                                                }
		}

	}

