import java.util.Scanner;

public class Main {

    
    public static void die(int turnsSurvived) {
        System.out.println();
        System.out.println("YOU DIED");
        if (turnsSurvived == 1) {
            System.out.println("You survived 1 turn.");
        } else {
            System.out.println("You survived " + turnsSurvived + " turns.");
        }
    }

    
    public static void survive(int turnsSurvived) {
        System.out.println();
        System.out.println("YOU SURVIVED THE WRONG TURN!");
        System.out.println("It took you " + turnsSurvived + " turns to make it out alive.");
    }

    public static void main(String[] args) {
        Scanner mailbox = new Scanner(System.in);

        int turnsSurvived = 0;        
        boolean hasWater = false;     
        boolean hasLantern = false;   

        
        System.out.println("Welcome to ONE WRONG TURN!");
        System.out.println("You enter a huge highway");
        System.out.println("The traffic is too long....");
        System.out.println("You decide to take a shortcut you noticed");
        System.out.println("You're met with the wild west roads.....");
        System.out.println("Type the number of the choice you want and then press enter.");
        System.out.println();

        
        System.out.println("The sun is going down and your gas light just turned on.");
        System.out.println("Both roads look exactly the same, just dust and dry grass for miles.");
        System.out.println("You see two directions, East and West, where do you go?");
        System.out.println("1. East");
        System.out.println("2. West");
        int q1Choice = mailbox.nextInt();

        if (q1Choice == 1) {
            turnsSurvived++;
            
            System.out.println();
            System.out.println("You turn east and drive for a long time with dust flying everywhere.");
            System.out.println("Your car sputters and stops right at the edge of an old town.");
            System.out.println();
            System.out.println("You get out and walk into a town where nobody is around.");
            System.out.println("A saloon has cigar smoke floating out the door and loud laughing inside.");
            System.out.println("The sheriff's office has a loud rattling sound coming from under the porch.");
            System.out.println("The stable is quiet, a horse is calmly eating and the water trough is full.");
            System.out.println("Where do you go?");
            System.out.println("1. Walk into the saloon");
            System.out.println("2. Walk into the stable");
            System.out.println("3. Walk into the sheriff's office");
            int q2Choice = mailbox.nextInt();

            if (q2Choice == 1) {
                
                System.out.println();
                System.out.println("You push the doors open and a whole gang of outlaws turns around to stare at you.");
                System.out.println("They don't like strangers and they like your shiny car even less.");
                die(turnsSurvived);
            } else if (q2Choice == 2) {
                turnsSurvived++;
                
                System.out.println();
                System.out.println("The horse just looks at you as you walk inside, it doesn't mind at all.");
                System.out.println("You find a canteen full of cool water and a lantern with plenty of oil.");
                System.out.println("In the corner there are saddle bags stuffed with real gold coins.");
                System.out.println("Through the back door you can see a long dry desert and a dark mine way up on a hill.");
                System.out.println("What do you do?");
                System.out.println("1. Grab the canteen and the lantern");
                System.out.println("2. Grab the saddle bags full of gold");
                System.out.println("3. Hide in the hay and wait for night");
                int q3Choice = mailbox.nextInt();

                if (q3Choice == 1 || q3Choice == 2) {
                    
                    if (q3Choice == 1) {
                        hasWater = true;
                        hasLantern = true;
                        System.out.println();
                        System.out.println("You hang the lantern on your belt and fill up the canteen all the way.");
                        System.out.println("It feels heavy but you know it will help you out there.");
                    } else {
                        System.out.println();
                        System.out.println("You throw the saddle bags over your shoulder and the gold coins clink together.");
                        System.out.println("They are really heavy but you can't stop smiling.");
                    }
                    turnsSurvived++;

                    
                    System.out.println();
                    System.out.println("You get out the back door of the stable and the path splits into two ways.");
                    System.out.println("One is a dirt trail with fresh wagon marks and lots of bullet shells in the dust.");
                    System.out.println("The other is an old train track that looks quiet and empty.");
                    System.out.println("Which way do you go?");
                    System.out.println("1. Take the dirt trail");
                    System.out.println("2. Follow the train track");
                    int q4Choice = mailbox.nextInt();

                    if (q4Choice == 1) {
                        
                        System.out.println();
                        System.out.println("You follow the wagon marks and soon you hear horses coming up fast behind you.");
                        System.out.println("The outlaws were riding that trail the whole time and they spot you right away.");
                        die(turnsSurvived);
                    } else if (q4Choice == 2) {
                        turnsSurvived++;
                        
                        System.out.println();
                        System.out.println("You walk along the old train track as the sun starts to go down.");
                        System.out.println("The track runs up to a deep gap with a wood bridge over it and half the boards are missing.");
                        System.out.println("Next to the gap there is a rocky hill and the ground looks hard and safe to climb.");
                        System.out.println("How do you get across?");
                        System.out.println("1. Walk across the bridge");
                        System.out.println("2. Climb down and around the hill");
                        int q5Choice = mailbox.nextInt();

                        if (q5Choice == 1) {
                            
                            System.out.println();
                            System.out.println("You step onto the first board and it snaps right under your boot.");
                            System.out.println("The whole bridge falls apart and you fall a really long way down.");
                            die(turnsSurvived);
                        } else if (q5Choice == 2) {
                            turnsSurvived++;
                            
                            System.out.println();
                            System.out.println("After a long climb you come out on top of the hill and see a mine opening in the rock.");
                            System.out.println("A cool wind blows out of it and you hear water dripping, but it is pitch black inside.");
                            System.out.println("The open desert around you is flat with no shade at all.");
                            System.out.println("An old mine cart sits on rusty tracks at the top of a very steep slope.");
                            System.out.println("What do you do?");
                            System.out.println("1. Walk into the mine");
                            System.out.println("2. Keep walking across the open desert");
                            System.out.println("3. Ride the mine cart down the slope");
                            int q6Choice = mailbox.nextInt();

                            if (q6Choice == 1) {
                                
                                if (hasWater && hasLantern) {
                                    turnsSurvived++;
                                    
                                    System.out.println();
                                    System.out.println("You light your lantern and take a drink of water, then walk slowly through the mine.");
                                    System.out.println("The tunnel goes all the way through and you come out right next to a real highway.");
                                    System.out.println("A truck driver stops for you and takes you home.");
                                    survive(turnsSurvived);
                                } else {
                                    
                                    System.out.println();
                                    System.out.println("You walk into the mine with no light and no water, only a bag of heavy gold.");
                                    System.out.println("Everything goes black and you step right off the edge of a deep shaft.");
                                    die(turnsSurvived);
                                }
                            } else if (q6Choice == 2) {
                                
                                System.out.println();
                                System.out.println("The desert goes on forever and the night turns freezing cold.");
                                System.out.println("You get lost walking in circles and you cannot go any farther.");
                                die(turnsSurvived);
                            } else if (q6Choice == 3) {
                                
                                System.out.println();
                                System.out.println("You jump in the old cart and push off down the slope.");
                                System.out.println("It goes faster and faster until the rusty wheels fly right off the track.");
                                die(turnsSurvived);
                            } else {
                                System.out.println("Invalid choice. Adventure ended.");
                            }
                        } else {
                            System.out.println("Invalid choice. Adventure ended.");
                        }
                    } else {
                        System.out.println("Invalid choice. Adventure ended.");
                    }
                } else if (q3Choice == 3) {
                    
                    System.out.println();
                    System.out.println("You dig into the hay and wait for night to come.");
                    System.out.println("The outlaws from the saloon walk in to get their horses and one of them pokes the hay with a pitchfork.");
                    die(turnsSurvived);
                } else {
                    System.out.println("Invalid choice. Adventure ended.");
                }
            } else if (q2Choice == 3) {
                
                System.out.println();
                System.out.println("You step onto the porch and the rattling gets louder and louder.");
                System.out.println("A nest of rattlesnakes shoots out from under the boards and you have nowhere to run.");
                die(turnsSurvived);
            } else {
                System.out.println("Invalid choice. Adventure ended.");
            }

        } else if (q1Choice == 2) {
            turnsSurvived++;
            
            System.out.println();
            System.out.println("You turn west and the road gets rougher and rougher.");
            System.out.println("Soon it turns into a red canyon with tall walls on both sides.");

            
            System.out.println();
            System.out.println("A rope bridge crosses a wide gap, the ropes look old but they are thick and tied tight to big posts.");
            System.out.println("The creek bed below is dry right now, but dark storm clouds sit over the mountains and you hear thunder.");
            System.out.println("A narrow cliff trail on the side of the canyon has little rocks rolling down it every few seconds.");
            System.out.println("Which way do you go?");
            System.out.println("1. Cross the rope bridge");
            System.out.println("2. Walk down the dry creek bed");
            System.out.println("3. Climb the cliff trail");
            int q7Choice = mailbox.nextInt();

            if (q7Choice == 1) {
                turnsSurvived++;
                
                System.out.println();
                System.out.println("The rope bridge holds all the way and you make it to the other side.");
                System.out.println("There is a campfire with a man in a big hat who waves at you and offers hot coffee.");
                System.out.println("He keeps a bandana over his face and there are lots of horses tied up behind him.");
                System.out.println("The bags on the horses have the word BANK stamped on them.");
                System.out.println("What do you do?");
                System.out.println("1. Sit down and have coffee with him");
                System.out.println("2. Quietly sneak around the camp");
                int q8Choice = mailbox.nextInt();

                if (q8Choice == 1) {
                    
                    System.out.println();
                    System.out.println("You sit down and the man smiles at you from behind his bandana.");
                    System.out.println("He says he can't let anyone who saw his camp and his stolen bank money leave.");
                    die(turnsSurvived);
                } else if (q8Choice == 2) {
                    turnsSurvived++;
                    
                    System.out.println();
                    System.out.println("You sneak by the camp without making a sound and keep walking as it gets dark.");
                    System.out.println("A small cabin with smoke coming out of the chimney has a sign that says KEEP OUT with a skull on it.");
                    System.out.println("The grass around the cabin has shiny metal bear traps hiding in it.");
                    System.out.println("On the other side there is a thin path through a field of tall cactus.");
                    System.out.println("Where do you go?");
                    System.out.println("1. Follow the path through the cactus field");
                    System.out.println("2. Knock on the cabin door");
                    int q9Choice = mailbox.nextInt();

                    if (q9Choice == 1) {
                        turnsSurvived++;
                        
                        System.out.println();
                        System.out.println("You get through the cactus field with only a few scratches.");
                        System.out.println("A giant sandstorm is rolling in from the south and it is moving very fast.");
                        System.out.println("A tiny stone hut with a strong door sits right next to you.");
                        System.out.println("The other way is a wide open field with a few small rocks in it.");
                        System.out.println("What do you do?");
                        System.out.println("1. Run across the open field to get away");
                        System.out.println("2. Hide in the stone hut");
                        int q10Choice = mailbox.nextInt();

                        if (q10Choice == 1) {
                            
                            System.out.println();
                            System.out.println("You run across the open field but the sandstorm is way faster than you.");
                            System.out.println("The sand fills your eyes and your mouth and you can't find your way.");
                            die(turnsSurvived);
                        } else if (q10Choice == 2) {
                            turnsSurvived++;
                            
                            System.out.println();
                            System.out.println("You wait in the stone hut for hours until the wind finally stops.");
                            System.out.println("When you step outside the sun is just coming up and everything is quiet.");
                            System.out.println("Far to the north you see a real highway sign and some trucks driving by.");
                            System.out.println("To the south there is a soft blue light that looks like someone waving a lantern and whispering your name.");
                            System.out.println("Which way do you walk?");
                            System.out.println("1. Walk toward the glowing light");
                            System.out.println("2. Walk toward the highway sign");
                            int q11Choice = mailbox.nextInt();

                            if (q11Choice == 1) {
                                
                                System.out.println();
                                System.out.println("You walk toward the glowing light and the whispering gets louder and louder.");
                                System.out.println("It turns out to be the ghost of an old cowboy who has been leading lost people into the desert for a hundred years.");
                                die(turnsSurvived);
                            } else if (q11Choice == 2) {
                                turnsSurvived++;
                                
                                System.out.println();
                                System.out.println("You walk all morning toward the highway sign and the whispering fades away behind you.");
                                System.out.println("A trucker pulls over, gives you some water, and drives you all the way back to your car.");
                                survive(turnsSurvived);
                            } else {
                                System.out.println("Invalid choice. Adventure ended.");
                            }
                        } else {
                            System.out.println("Invalid choice. Adventure ended.");
                        }
                    } else if (q9Choice == 2) {
                        
                        System.out.println();
                        System.out.println("You walk toward the cabin and your foot lands right in a hidden bear trap.");
                        System.out.println("It snaps shut and you can't pull it open no matter how hard you try.");
                        die(turnsSurvived);
                    } else {
                        System.out.println("Invalid choice. Adventure ended.");
                    }
                } else {
                    System.out.println("Invalid choice. Adventure ended.");
                }
            } else if (q7Choice == 2) {
                
                System.out.println();
                System.out.println("You walk down the dry creek bed and the thunder gets louder and louder.");
                System.out.println("A wall of brown water comes down the canyon and sweeps you away before you can climb out.");
                die(turnsSurvived);
            } else if (q7Choice == 3) {
                
                System.out.println();
                System.out.println("You climb up the cliff trail and the rocks start rolling faster and faster.");
                System.out.println("A big rock breaks loose and hits you and you slide right off the edge.");
                die(turnsSurvived);
            } else {
                System.out.println("Invalid choice. Adventure ended.");
            }

        } else {
            System.out.println("Invalid choice. Adventure ended.");
        }

        mailbox.close();
    }
}