use springblog_db;

insert into user(username, email, password)
values
       ('catdad', 'catdad@cat.com', 'meow'),
       ('catpup', 'catpup@cat.com', 'meow'),
       ('catpap', 'catpap@cat.com', 'meow');

select * from user;

select * from posts;

drop table people;

insert into posts(title, body)
values
       ('hiss', 'Pretend you want to go out but then don''t love and coo around boyfriend who purrs and makes the perfect moonlight eyes so i can purr and swat the glittery gleaming yarn to him (the yarn is from a $125 sweater). Being gorgeous with belly side up. I like fish run as fast as i can into another room for no reason but all of a sudden cat goes crazy'),
       ('purr', 'Stuff and things i like to spend my days sleeping and eating fishes that my human fished for me we live on a luxurious yacht, sailing proudly under the sun, i like to walk on the deck, watching the horizon, dreaming of a good bowl of milk yet gimme attention gimme attention gimme attention gimme attention gimme attention gimme attention just kidding i don''t want it anymore meow bye for wack the mini furry mouse for run up and down stairs. Plop down in the middle where everybody walks'),
       ('mraow', 'Spend all night ensuring people don''t sleep sleep all day crash against wall but walk away like nothing happened and scratch at the door then walk away for eat fish on floor for cat slap dog in face more napping, more napping all the napping is exhausting so freak human out make funny noise mow mow mow mow mow mow success now attack human.'),
       ('sniff', 'Swat at dog plays league of legends yet hell is other people and throw down all the stuff in the kitchen mouse mrow and scamper. Headbutt owner''s knee eat owner''s food or murr i hate humans they are so annoying yet enslave the hooman have a lot of grump in yourself because you can''t forget to be grumpy and not be like king grumpy cat and pee in the shoe. Catto munch salmono ptracy, but sleeps on my head meow go back to sleep owner brings food and water tries to pet on head, so scratch get sprayed by water because bad cat skid on floor, crash into wall chew on cable.'),
       ('meow', 'Lick plastic bags howl on top of tall thing so ask to be pet then attack owners hand, stuff and things and attack the child but Gate keepers of hell. Slap owner''s face at 5am until human fills food dish howl on top of tall thing but run outside as soon as door open and stare out cat door then go back inside mrow yet use lap as chair.');


