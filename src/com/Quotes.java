package com;

import java.util.Random;

public class Quotes {
	
	public static Quote[] quotes =
	{
		// The Shooting Star
		new Quote("A shooting star! Quick Snowy, wish!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("A star too many in the Great Bear... It beats me!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("It looks like a huge ball of fire...", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("This is it! The end of the world!!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("Hooray! It's only an earthquake!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("Hooray! The end of the world has been postponed!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("The dynamite! The crazy fool! He's taken the dynamite!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("This will blow away the cobwebs, eh, Snowy? What wonderful air...", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("What?... A breeze? Isn't this a gale?", Character.TINTIN, Book.THE_SHOOTING_STAR),
		new Quote("I'm glad to hear it. I thought you were going to kill each other!", Character.TINTIN, Book.THE_SHOOTING_STAR),
		
		new Quote("He's as mad as a hatter!", Character.DETECTIVES, Book.THE_SHOOTING_STAR),
		new Quote("I'm going to cause a sensation!", Character.DETECTIVES, Book.THE_SHOOTING_STAR),
		new Quote("Quick, we must get a move on!", Character.DETECTIVES, Book.THE_SHOOTING_STAR),
		new Quote("I don't want to go in the water!... Wow!... Wow!", Character.DETECTIVES, Book.THE_SHOOTING_STAR),
		
		new Quote("Come on out, centipede! Let's see you in the daylight!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Come down, by thunder, or I'll have you clapped in irons!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Thundering typhoons!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("ALL HANDS ABOARD SHIP!... We sail at once.", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("They'll find the sea-legs in a day or two...", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Pirates! Shipwreckers! Sea-lice! Filibusters! Hoodlums! Road-hogs! Freshwater swabs!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Me? A semaphore?... You, why you're nothing but a...", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Ten thousand thundering typhoons!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Gang of thieves! Black marketeers! Monopolizers! Turncoats! Ophicleides! Colosynths!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Let me go! I'm going to tear those caterpillars into little pieces!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Billions of blue blistering barnacles!... Dratted animal!... Wait till I catch the little pirate!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Come on! We shall see what we shall see!... Show a leg! On deck with you!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		new Quote("Worse than that!... We're out of whisky!", Character.CAPTAIN_HADDOC, Book.THE_SHOOTING_STAR),
		
		//Cigars of the pharaoh
		new Quote("This is the life, Snowy. A really quiet holiday for a change...", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("What a strange fellow!", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("No! No! Never in a thousand years! No one's going to turn me into a mummy!", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("My name? It won't mean a thing to you but at home they call me Tintin.", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("Amazing what a little publicity will do for you!", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("There aren't any wells on our way. And the desert spells death without water.", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("You see, one should never give up hope!", Character.TINTIN, Book.CIGARS_OF_THE_PHARAOH),
		
		new Quote("Marvellous... You mean dull as ditchwater!... Why doesn't someone fall overboard to brighten things up?", Character.SNOWY, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("It's going to take more than that to catch me!", Character.SNOWY, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("Hooray, I've learnt to talk Elephant!", Character.SNOWY, Book.CIGARS_OF_THE_PHARAOH),
		
		new Quote("We arrest you in the name of the law!", Character.DETECTIVES, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("I smell danger: there's dirty work somewhere round here...", Character.DETECTIVES, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("Bother! We were mistaken! To be precise we're a mistake.", Character.DETECTIVES, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("Goodness gracious! It's the ticket collecter! To be precise: we've collected a ticket!", Character.DETECTIVES, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("He's gone: it's all clear. To be precise: the all clear's gone!", Character.DETECTIVES, Book.CIGARS_OF_THE_PHARAOH),
		new Quote("We heard about it, so this is where we are. To be precise: so where are we?", Character.DETECTIVES, Book.CIGARS_OF_THE_PHARAOH),
				
		// Blue lotus
		new Quote("A dart... Dipped in Rajaijah juice... The poison of madness?!", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Quick! Speak! What you have to tell me?", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Great snakes!... He can't have been kidnapped!", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Bit speedy round here, eh?", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Officer, I found this poor madman. Can you take care of him?", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("An opium den? Right! I'll be there tonight...", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Crumbs, it's cold... Now what are they doing?... Taking cover?... I wonder...", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Mad!... I'm going to go mad!", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Chick... Chick... Chick... Chicken!", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("There isn't a moment to lose... I must get out of the city...", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("You saved my life. I shall never forget...", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Well, that's torn it. Now I know what's in store for me.", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Oh well, I've nothing to lose...", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("But Chang, all white men aren't wicked. You see, different peoples don't know enough about eachother.", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Hands up gangster, or I'll 'photograph' you at point blank range!", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Ha! Ha! None of that fell on deaf ears!...", Character.TINTIN, Book.THE_BLUE_LOTUS),
		new Quote("Great snakes! We've come out through a safe!...", Character.TINTIN, Book.THE_BLUE_LOTUS),

		new Quote("Yes, I'm inclined to agree!", Character.SNOWY, Book.THE_BLUE_LOTUS),
		new Quote("What about a cup of tea for me?", Character.SNOWY, Book.THE_BLUE_LOTUS),
		
		new Quote("Don't look now, but something tells me we're being followed...", Character.DETECTIVES, Book.THE_BLUE_LOTUS),
		
		// The Calculus Affair
		new Quote("Vanished!... Vaporized!... Poor Captain! How dreadful!", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),
		new Quote("Captain! Snowy's picked up a scent. Come on, let's follow him.", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),
		new Quote("Great snakes! The wounded man... he's vanished!", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),
		new Quote("Go on, Snowy! seek it out!", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),
		new Quote("Captain, I propose we crack a bottle of champagne in honour of these gentlemen.", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),
		new Quote("Gentlemen, a toast to Borduria and her glorious ruler, Marshal Kurvi-Tasch!", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),
		new Quote("It's true, Captain. When you're in a crowd there's always less chance of being noticed.", Character.TINTIN, Book.THE_CALCULUS_AFFAIR),

		new Quote("Ah, peace and quiet! ... How quiet it is here... Just listen to it...", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Billions of bilious blue blistering barnacles! Now the electricity has gone! That's the last straw!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("He can go to the devil - him, and his insurance, and his Uncle Anatole!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("In heaven's name, what's the matter now?", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("...TIN...BLOP...BLUB...PLOB", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Road-hog!... Steam-roller!... Bully!... Dipsomaniac!... Nitwit!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Just look at that horde of rubbernecs!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("You clumsy oaf, are you suggesting it was my fault?", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Lucky for you I'm in a hurry!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Yes, in a hurry, you ectoplasmic by-product! Otherwise...", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Carpathian caterpillar! Just wait till I see him again!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Brutes!... Filibusters!... Nitwits!... Steam-rollers!... Abecedarians!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Your wise has rare distinction.", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Nit-witted ninepins! Bashi-bazouks! A &quot;C.D.&quot; plate, so do as you like! Certified Diplodocuses, that's what you are!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Gansters!... Anacoluthons!... Bashi-bazouks!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Blackguard!... Egoists!... Nitwits!... Troglodytes!... Polygraphs!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Beasts!... Autocrats!... Profiteers!... Fat faces!... Tramps!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Old Calculus has certainly led us pretty dance around the countyside!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),
		new Quote("Incredible!... Fantastic!... That's upset the apple-cart!", Character.CAPTAIN_HADDOC, Book.THE_CALCULUS_AFFAIR),

		new Quote("You can rely on us; &quot;Mum's the word&quot;. That's our motto. Yes, &quot;Dumb's the word.&quot; That's our motto.", Character.DETECTIVES, Book.THE_CALCULUS_AFFAIR),

		new Quote("My umbrella! My own little umbrella! At last I've found you!", Character.PROF_CALCULUS, Book.THE_CALCULUS_AFFAIR),
		new Quote("And the cream of the joke is, without these plans the Bordurians can't do a thing!", Character.PROF_CALCULUS, Book.THE_CALCULUS_AFFAIR),
		new Quote("Chicken-pox?? ... At your age? ... Goodness!", Character.PROF_CALCULUS, Book.THE_CALCULUS_AFFAIR),
		
		new Quote("Aha, you little flaterer, so you've come to congratulate me, with this... this fisherman... Mr? ... Mr? ...", Character.CASTAFIORE, Book.THE_CALCULUS_AFFAIR),

		// Tintin in Tibet
		new Quote("I'm terribly sorry, I must have dropped off... I had a horrible nightmare...", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Champagne? At this hour?", Character.PROF_CALCULUS, Book.TINTIN_IN_TIBET),
		new Quote("He's alive, I tell you! I'm packing my bag and leaving for Nepal.", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Captain, stop! Not there! Here! The other steps!", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Fruit?... Good to eat?... Nice and Sweet?... Yum-yum?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("W-w-what happened? I ate one of those things. It was just like swallowing a volcano in full blast!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Please, please... Watch your language! I didn't shout at you, did I?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Captain, what can I say? You're a marvel!", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Whisky, by thunder! What about those bottles in my pack?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("I... I don't know... I must have fallen asleep on my feet... The heat, I expect... I think I was dreaming...", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Bianca Castafiore!... She's HERE, by thunder! That woman follows us to the ends of the earth!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Billions of blistering barnacles! It's about time they made a tent to stay up without all these fiddling bits of string!!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("What are all those four shouting about?... Someting wrong?", Character.SNOWY, Book.TINTIN_IN_TIBET),
		new Quote("To the bridge! It's our one chance of saving him!", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Oh, there you are. So you managed to rescue the old drunkard?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("My whisky... safe... That's the main thing!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("The yeti! The Abominable Snowman!!", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("The Abominable Snowman! That's a good one! Don't make me laugh! Fairy stories... old wives' tales! Who's ever seen this famous yeti?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Fiddle-faddle! You're imagining things... it's only the wind... But here's something real enough: a bottle of whisky!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("My beard! It's caught in the zip!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Rubbish! What sort of village idiot d'you take me for? Half-baked Haddock?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("The yeti drinks whisky! I expect he plays the bagpipes too!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("My whisky, you Cro-Magnon!... My whisky, you Mameluke, you!... Vampire!... Dipsomaniac!... Body-snatcher!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("You odd-toad ungulate!... Macrocephalic baboon!... Phylloxera!... Cannibal!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Diplodocus! ... Filibuster! ... Megalomaniac!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Abandoning ship! ... The lily-livered bandicoots!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("No good! ... Not a sound! The noise of the wind is drowning my voice. And it's getting dark, too. What'll become of us now, Snowy?", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("A crevasse! Crumbs, Snowy, that was a near thing!", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("I advise him to keep his distance, the drunken old ape!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Blistering yetis, it's the barnacle! ... I mean... Yettering barnacles, it's the blister... up there... I mean... the yeti!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("It's sheer lunacy, but I'll go with you. I've got a little score to settle with that pithecanthropic pickpocket up there!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Did you say... er... brandy? You've still got some brandy?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("I suppose they think I've got wings!", Character.SNOWY, Book.TINTIN_IN_TIBET),
		new Quote("What's that jackass doing out of doors at this hour?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("It'd take more than an earthquake to shift me!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Go, Snowy, go!... Our lives depend upon you! Go on, quickly!", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Golly, what a magnificent bone!... It's certainly a five-star model! What a bone!", Character.SNOWY, Book.TINTIN_IN_TIBET),
		new Quote("Come with me! We must save Tintin!", Character.SNOWY, Book.TINTIN_IN_TIBET),
		new Quote("Pity! Too late to snap the flying father! He's come down to earth!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("Very well, I'll go alone if necessary. My friend is in danger. You can't expect me to desert him now.", Character.TINTIN, Book.TINTIN_IN_TIBET),
		new Quote("Help! Fire! Murder! Whatever shall I do?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("What happened?... An atom bomb, wasn't it?... Are we all dead?", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("So there you are, you ante-diluvian bulldozer!... Come closer, if you dare, you jobbernowl, and I'll turn you into a hearth-rug!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		new Quote("MEGACYCLE! PYROMANIAC!", Character.CAPTAIN_HADDOC, Book.TINTIN_IN_TIBET),
		
		//The secret of the unicorn
		new Quote("I've a hunch that we're off on one of our adventures again...", Character.SNOWY, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Burgled twice in one day... Not bad at all!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Tintin, you're a real Sherlock Holmes!", Character.SNOWY, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Treasure, Snowy!... Come on, this is going to be a treasure-hunt!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Avast, you dogs!... Sea-gherkins!... Baboons!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Buccaneers!... Filibusters!... Bagpipers!... Gallows-Fodder!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("It is the year 1676. The UNICORN , a valiant ship of King Charles II's fleet, has left Barbados in the West Indies, and set sail for home.", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("The red pennant!... No quarter given!... A fight to the death, no prisoners taken!... You understand?", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Here they come! Grapling irons are hurled from the enemy ship. With hideous yells the pirates stream aboard the UNICORN", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Back, you rats! Avast, sea-lice! Belay, lubberly scum!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Darkness fell; the pirates found the UNICORN's cargo of rum, broached the casks, and made themselves abominable drunk...", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Suddenly, nimbly parrying a thrust, he leapt to one side...", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("That's it, Captain!... Red Rackham's treasure will be ours!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Thundering typhoons! We aren't the only ones hunting for Red Rackham's treasure!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("I'm sorry. We're on duty. On duty we can have no friends!", Character.DETECTIVES, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Now, if there's a victim, there must be a culprit. A brilliant deduction! Now we only have to find him...", Character.DETECTIVES, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Artichokes!... Vermicellis!... Phylloxera!... Pyrographers!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Crab-apples!... Goosecaps!... Gogglers!... Jelly-fish!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Look!... Your corpse is coming around!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Sparrows?... What do you mean?... Crumbs, he's fainted!...", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("So do I, Captain. It's all very mysterious. &quot;To be precise: very mysterious&quot;, as the Thomsons would say.", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("My wallet!... This time I've got you, you scoundrel!", Character.DETECTIVES, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Got you my friend!... And I'm not letting you go!", Character.DETECTIVES, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("It looks very much as if I'm a prisoner...", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Eureka!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("A quick bath and I'll soon get rid of this mud.", Character.SNOWY, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("The joke's over, you gangsters! Hands up!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Snowy! Good old Snowy!... You managed to find me!", Character.TINTIN, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Ha, bully!... Ha, pirate!... Ha, pickled herring!", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("That thug had come around - he was just going to shoot you...", Character.CAPTAIN_HADDOC, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Property of Thomson... property of Thompson... Thomson... Thompson... Thomson... Thompson... Thomson... Thompson...", Character.DETECTIVES, Book.THE_SECRET_OF_THE_UNICORN),
		new Quote("Here, Thompsons, hold my stick while I just deal with this gentleman...", Character.DETECTIVES, Book.THE_SECRET_OF_THE_UNICORN),
		
		//Red Rackhams treasure
		new Quote("Please speak a bit louder. I'm a little hard of hearing.", Character.PROF_CALCULUS, Book.RED_RACKHAMS_TREASURE),
		new Quote("I'm delighted to meet you. My name is Calculus. Cuthbert Calculus.", Character.PROF_CALCULUS, Book.RED_RACKHAMS_TREASURE),
		new Quote("Yes, that's a new device for putting bubbles in soda-water...", Character.PROF_CALCULUS, Book.RED_RACKHAMS_TREASURE),
		new Quote("But anyway, now we are aboard you will be able to feel that you are perfectly safe. To be precise: perfectly safe.", Character.DETECTIVES, Book.RED_RACKHAMS_TREASURE),
		new Quote("We must behave like old sea-dogs...", Character.DETECTIVES, Book.RED_RACKHAMS_TREASURE),
		new Quote("It's him, Tintin!... He's stolen my pillow! That's not true! It's him - he's taken one of my blankets!", Character.DETECTIVES, Book.RED_RACKHAMS_TREASURE),
		new Quote("Steaming blood! There's not a drop of whisky aboard! If I catch the monster who played this trick on us, he'll be in for a rough time!...", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("All right... You... you want a d-d-d-drink too?", Character.SNOWY, Book.RED_RACKHAMS_TREASURE),
		new Quote("Wretch!... Ignoramus!... Abominable Snowman!... I'll throw you overboard! Overboard, d'you hear?...", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("I mean, gentlemen, that according to your calculations we are now standing inside Westminster Abbey!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("Coxswain at the wheel!... Helm hard a-port!... Midships!... Steer due east.", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("There it is at last! Our treasure island!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("Eaten?... Do you mean cannibals lived on this island?... Man-eaters?", Character.DETECTIVES, Book.RED_RACKHAMS_TREASURE),
		new Quote("Your gun!... Give me your gun!... I'm going to turn them into parrot soup.", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("Blistering baboons!... Monkeys!... Gibbons!... Orang-outangs!... Give us back that gun, cercopithecuses!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),		
		new Quote("Thing's look bad, Snowy! Our propeller is entangled in the weeds!", Character.TINTIN, Book.RED_RACKHAMS_TREASURE),		
		new Quote("No, but I was a great sportsman in my youth...", Character.PROF_CALCULUS, Book.RED_RACKHAMS_TREASURE),		
		new Quote("Thundering typhoons, I'm trying to! What do you think I'm doing? Playing the cornet?", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),		
		new Quote("You infernal impersonations of abominable snowmen! Pump for your lives!... Faster!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("A bottle of rum, my friends!... Jamaica rum, and it's more than two hundred and fifty years old!... Just you taste it!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("You never ordered us to stop pumping, Captain. Sw here we are, pumping. To be precise: we're pumping.", Character.DETECTIVES, Book.RED_RACKHAMS_TREASURE),
		new Quote("Off to bed, nitwits! You'll have plenty more pumping believe me!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("A casket!... A casket!... Red Rackham's treasure! Red Rackham's treasure!!... Here it is at last!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("These are old documents!... Definitely!... Old documents!", Character.PROF_CALCULUS, Book.RED_RACKHAMS_TREASURE),
		new Quote("Yes, it's all your fault, you certified ignoramus!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("You see that, eh? I suppose it's the figure-head of the TITANIC!", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("Well, what do you say, now, my friends? All's well that ends well, eh?", Character.CAPTAIN_HADDOC, Book.RED_RACKHAMS_TREASURE),
		new Quote("Just as I always said: more to the west!", Character.PROF_CALCULUS, Book.RED_RACKHAMS_TREASURE),
		
		//Destination Moon
		new Quote("You've read this brochure on Syldavia?... What a country!... They export mineral-water, the poisoners!...", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("What are you doing?... Not one drop of that disgusting mineral-water in my whisky!", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("Sea-gherking!... Pirate!... Logarithm!.. Baboon!... You call youself a policeman and you can't open a bottle properly!", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("Here's to you!... Ha! ha! ha! Passengers for the moon, all aboard the bus!... Sorry, the rocket!... You are taking passengers, I hope?", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("Just when is someone going to let me out of this fancy-dress?", Character.SNOWY, Book.DESTINATION_MOON),
		new Quote("It's about time someone took interest in me!", Character.SNOWY, Book.DESTINATION_MOON),
		new Quote("Great snakes! It went off in the professor's room! Quick! I must hurry!", Character.TINTIN, Book.DESTINATION_MOON),
		new Quote("There you go! Acrobatics again! You'll break every bone in your body one day!", Character.SNOWY, Book.DESTINATION_MOON),
		new Quote("Now keep calm!... No one leave the room!... And Dont't picnic... I mean panic... We'll proceed with caution... and look around...", Character.DETECTIVES, Book.DESTINATION_MOON),
		new Quote("And now the great vituoso Haddocksikoff... Pom Pom Pom Pompity Pom", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("The Moon and back!... Do you realise what those little words mean: THE MOON AND BACK!", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("The wonders of modern science!... Just an ordinary lever, and click!... Hundreds of thousands of miles away an engine starts up!... It's fantastic!", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("I beg your pardon, but I've followed you exactly!... I'm not deaf, am I?", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("Be brave, Cuthbert!... Now you must destroy your whole life's work!... There!", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("Oh misery!... Misery!... All is lost!... Our secrets, our discoveries, lost!... Everything will drop into foreign hands!... This is appalling!", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("M-m-m... m-mice!... It's alive with mice in here!", Character.DETECTIVES, Book.DESTINATION_MOON),
		new Quote("To dare say such a thing to me!... You!... You follow me... I'll show you just how I act the goat!... Come along!", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("Begone, you worm! Out of my sight! I'm acting the goat. d'you hear?", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("I often say to myself: one of these days I'll learn to drive! Nowadays everyone shold be able to drive a car!", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("You road-hog!... Bully!... Steamroller!... Cyclotron!", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("You think this... this crackpot contraption will take you to the moon?...", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("And he just sits there looking at me, the jelly-fish! You couldn't be frightened, could you? You moth-eaten marmot!", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("A goat!... A goat!... You dare call me a goat!... This is too much! You're not getting away with that!", Character.PROF_CALCULUS, Book.DESTINATION_MOON),
		new Quote("Why on earth should I look happy? Because we're off to the Moon?", Character.CAPTAIN_HADDOC, Book.DESTINATION_MOON),
		new Quote("Well Tintin old man, you've lived through plenty of adventures... But I wonder if this isn't going to be your last!", Character.TINTIN, Book.DESTINATION_MOON),

		// Prisoners of the sun
		new Quote("Hoity toity! Aren't we grand!", Character.SNOWY, Book.PRISONERS_OF_THE_SUN),
		new Quote("Thomson and Thompson! What are those nitwits doing here?", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Putting a ship in quarantine, you landlubber, means keping her in isolation for some time, to avoid risk of infection.", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("That sounds like the telephone. To be precise: the telephone.", Character.DETECTIVES, Book.PRISONERS_OF_THE_SUN),
		new Quote("You can't be asleep, you're talkning to me! You know very well that I talk in my sleep!", Character.DETECTIVES, Book.PRISONERS_OF_THE_SUN),
		new Quote("It's like looking for a needle in a haystack. To be precise: we look like needles in a haystack.", Character.DETECTIVES, Book.PRISONERS_OF_THE_SUN),
		new Quote("Aren't you ashamed?... Bullying a child like that?", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("And fee-fi-fo-fum... And since you're so worried about my friend Tintin, take a look behind you!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Blistering barnacles, what's going on?... He's hanging on to the condor's legs!... By thunder, what next?", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Pirate!... Doryphore!... Gobbledygook! Just wait till I get you to the taxidermist, you bald-headed budgerigar!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Brrr! it's freezing!... You bet I'll catch a cold... There, what did I say?... Aaaah!... Aaaah!...", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Wait, Captain, not so fast!... Don't drink it all!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Be off with you, slubberdegulions!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Patagonians!... Bashi-bazouks! Carpet-sellers! Kleptomaniacs!...", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("You know Zorrino, the Captain's guardian angel has a full-time job!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Good old Snowy! You've managed to dig out the Captain's cap.", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Stop!... Look, there's a cave!... Why don't we spend the night here?", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Hop it, you four-legged Cyrano!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("This beastly steaming jungle!... Will it never end?", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Tintin!... Tintin!... Is is really you?... Where are you?", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Davy Jones, here I come!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("It's incredible!... Extraordinary!... Amazing!... Fantastic!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("No noise, now!... Careful!... I've got a hunch we're nearly at the end of out journey.", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Inca mummies! We certainly are in a tomb!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Golly! Whatever next? A musical bone!", Character.SNOWY, Book.PRISONERS_OF_THE_SUN),
		new Quote("Sea-gherkins!... Ectoplasms!... Poltroons!... Politicians!... Doryphores!... Terrorists!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Be put to death!... D'you really think we'll let ourselves be massacred, just like that, you tin-hatted tyrant?!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("My pipe!... My poor pipe!... Blistering barnacles, it's broken!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Snowy!... stop fooling around... That's enough!... Come here!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("E U R E K A !", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Me? Put on that Patagonian petticoat? Never!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Never! d'you hear?... And when I say never, I mean never!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Unless I'm much mistaken, there's something very fishy going on.", Character.SNOWY, Book.PRISONERS_OF_THE_SUN),
		new Quote("Stay, Huascar!... The Sun God will not hear you prayers!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("O Sun, lord of the day, show mercy, I pray thee... Pity thy children and show thy light once more!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN),
		new Quote("Me too, old salt, I swear too!... May my rum be rationed and my beard be barbecued if I breathe so much as a word!", Character.CAPTAIN_HADDOC, Book.PRISONERS_OF_THE_SUN),
		new Quote("Me too; I swear I will never act in another film, however glittering the contract Hollywood may offer me. You have my word.", Character.PROF_CALCULUS, Book.PRISONERS_OF_THE_SUN),
		new Quote("Water?... The Captain drinking water?... I'd never have believed the day would come!", Character.TINTIN, Book.PRISONERS_OF_THE_SUN)
	};

	private static int previousRandom1 = 0, previousRandom2 = 0;

	public static Quote getRandomQuote()
	{
		int newRandom = 0;

		do {
			Random r = new Random();
			newRandom = r.nextInt(quotes.length);
		} while (previousRandom1 == newRandom || previousRandom2 == newRandom);
		
		previousRandom2 = previousRandom1;
		previousRandom1 = newRandom;
		Quote quote = quotes[newRandom];
		quote.quoteID = newRandom;

		return quote;
	}


	public static Quote getRandomQuote(int characterID)
	{
		int newRandom = 0;

		do {
			Random r = new Random();
			newRandom = r.nextInt(quotes.length);
		} while (previousRandom1 == newRandom || quotes[newRandom].characterid != characterID);

		previousRandom2 = previousRandom1;
		previousRandom1 = newRandom;
		Quote quote = quotes[newRandom];
		quote.quoteID = newRandom;

		return quote;
	}
}
