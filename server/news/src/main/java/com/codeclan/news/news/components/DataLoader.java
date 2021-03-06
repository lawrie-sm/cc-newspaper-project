package com.codeclan.news.news.components;

import com.codeclan.news.news.models.Article;
import com.codeclan.news.news.models.Author;
import com.codeclan.news.news.properties.ArticleCategory;
import com.codeclan.news.news.repositories.ArticleRepository;
import com.codeclan.news.news.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    ArticleRepository articleRepo;

    @Autowired
    AuthorRepository authorRepo;

    public void run(ApplicationArguments args) {

        Author andy = new Author("Reporter", "Andy Mckay");
        Author lawrie = new Author("Reporter", "Lawrie Scott-McFarlane");
        Author borat = new Author("Reporter", "Borat Sagdiyev");
        Author rana = new Author("Reporter", "Rana Akbar");
        Author chris = new Author("Editor", "Chris McAuley");
        Author azamat = new Author("Editor", "Azamat Bagatov");
        authorRepo.save(andy);
        authorRepo.save(lawrie);
        authorRepo.save(azamat);
        authorRepo.save(chris);
        authorRepo.save(rana);
        authorRepo.save(borat);
        Article article1 = new Article("Be More Chill: The word-of-mouth hit musical now heading to London\n",
                "A new musical which became a word-of-mouth hit in the US is set to open in London after a successful Broadway run",
                "Be More Chill, which has been praised for attracting a new teen audience to the theatre, will open at The Other Palace in February, the BBC can reveal.\n" +
                        "\n" +
                        "The pop-rock, sci-fi musical tells the story of an anxious teenager who takes a pill in order to become more popular.\n" +
                        "\n" +
                        "The soundtrack has played a large part in making the show a sleeper hit - racking up 300 million streams.\n" +
                        "\n" +
                        "\"Ever since its sellout off-Broadway run, the show has become a hit with the best kind of social-media word of mouth powering its progress to Broadway,\" wrote Tim Teeman in The Daily Beast.\n" +
                        "\n" +
                        "\"It has brought, so observers have noted, a younger audience to the theatre. It has caused great excitement and created extreme fandom.\"\n" +
                        "\n" +
                        "Be More Chill originally premiered in 2015 at the Two River Theatre in Red Bank, New Jersey. It had a limited run there and little was made of the cast soundtrack which was quietly released on streaming services.\n" +
                        "\n" +
                        "In 2017, the number of online listeners to the recording started growing, and the show began to attract a cult following, particularly among young people - most of whom hadn't seen the show, but still created Tumblr pages, YouTube videos, blogs and art fiction in tribute to it.\n" +
                        "\n" +
                        "As a result, the show was revived by its creators the following year, first as an off-Broadway production before it transferred to the Lyceum Theatre for a run on Broadway.\n" +
                        "\n" +
                        "\"I'm a little older and so I'm used to word-of-mouth being telling my friends about an amazing show or movie,\" Be More Chill's producer Jerry Goehring tells BBC News. \"And in the old days we had radio that would play a song and it would be popular. Word of mouth would happen in different ways.\n",
                andy,
                new GregorianCalendar(2019, Calendar.JANUARY, 10),ArticleCategory.CULTURE );

        Article article2 = new Article("Claim over Boris Johnson's behaviour 'deeply concerning",
                "Claims that Boris Johnson squeezed a journalist's thigh under a table during a lunch are \"deeply concerning\", a former Tory cabinet minister has said.",
                "Writing in the Sunday Times, Charlotte Edwardes said the incident took place in 1999, but Downing Street called the allegation \"untrue\".\n" +
                        "\n" +
                        "Justine Greening, now an independent MP, said it raised \"a question about character and integrity\".\n" +
                        "\n" +
                        "But Chancellor Sajid Javid said he had \"full faith\" in the PM.\n" +
                        "\n" +
                        "Following No 10's denial on Sunday evening, Ms Edwardes tweeted: \"If the prime minister doesn't recollect the incident then clearly I have a better memory than he does.\"\n" +
                        "\n" +
                        "No 10 denies Johnson 'thigh squeeze' claim\n" +
                        "In her first column for the Sunday Times - published on the eve of the Conservative conference in Manchester - Ms Edwardes said she was seated on Mr Johnson's right at the lunch, held at the Spectator magazine's offices.\n" +
                        "\n" +
                        "Mr Johnson was editor of the magazine at the time.\n",
                lawrie,
                new GregorianCalendar(2019, Calendar.FEBRUARY, 10 ), ArticleCategory.UK);

        Article article3 = new Article("Russian GP: Can Ferrari control Charles Leclerc and Sebastian Vettel fall-out?\n",
                "Ferrari's damage-limitation mode went into overdrive after the Russian Grand Prix, but it remains to be seen whether they will be able to control the fall-out from the latest team orders controversy between their two drivers.",
                "The facts are simple.\n" +
                        "\n" +
                        "Sebastian Vettel, several times in the early laps of the race, ignored a direct order to let Charles Leclerc past him into the lead.\n" +
                        "\n" +
                        "Vettel was in front as a result of Leclerc executing his part of a strategy agreed before the race and aimed at ensuring the German could pass Lewis Hamilton's Mercedes, which qualified between them in second place, so the Ferraris could run one-two after the start.\n" +
                        "\n" +
                        "It seems, though, that Vettel did not fulfil his part of the bargain, and - although they denied it afterwards - it looked as if the team had to take things into their own hands to resolve it.\n" +
                        "\n" +
                        "There is so much at stake here - a proud champion fighting for his position in the team, which is patently under threat from an extravagantly talented youngster, and a team boss struggling to contain the potentially volcanic mix when two alphas are in the same cage.\n" +
                        "\n" +
                        "In the end, the way the race turned out, Ferrari were able to keep a lid on the situation - publicly at least. But as the dust settled afterwards, from what was not said as much as what was, it was hard to believe that the matter would rest there.",
                azamat,
                new GregorianCalendar(2019, Calendar.MARCH, 10), ArticleCategory.SPORT);

        Article article4 = new Article("Saudi crown prince warns of 'Iran threat' to global oil",
                "Saudi Arabia's crown prince has warned that oil prices could rise steeply if the world does not act to deter Iran.",
                "Saudi Arabia's crown prince has warned that oil prices could rise steeply if the world does not act to deter Iran.\n" +
                        "\n" +
                        "Mohammed bin Salman said failure to act could embolden Iran and lead to war, which he said would ruin the global economy, following an attack on oil facilities which he blames on Tehran.\n" +
                        "\n" +
                        "Iran said the prince's remarks would \"bring [the Saudis] nothing but shame\".\n" +
                        "\n" +
                        "The prince also said he accepted some responsibility for journalist Jamal Khashoggi's killing.\n" +
                        "\n" +
                        "But, speaking to CBS News, he denied personally ordering it.\n" +
                        "\n" +
                        "The prince, who is considered the de facto ruler of Saudi Arabia, is suspected of personally targeting Mr Khashoggi, a Saudi journalist critical of the government in Riyadh.\n" +
                        "\n" +
                        "Mr Khashoggi was killed in Saudi Arabia's consulate in Turkey on 2 October 2018.\n",
                borat,
                new GregorianCalendar(2019, Calendar.MARCH, 10), ArticleCategory.WORLD);

        Article article5 = new Article("Leicester 5-0 Newcastle: No need for Newcastle to panic yet - Micah Richards analysis",
                "Things look pretty grim for Newcastle after Sunday's heavy defeat by Leicester but I don't think they need to press the panic button yet.",
                "Yes, the second half at the King Power Stadium turned into a total nightmare for the Magpies but you have to remember they were down to 10 men and were playing an in-form Foxes side, who went after them relentlessly.\n" +
                        "\n" +
                        "I actually thought the Magpies were decent defensively and held a good line until Isaac Hayden was sent off, and it was only after the break when their heads dropped and things got messy.\n" +
                        "\n" +
                        "Leicester scored some of their goals far too easily but I don't think that was down to a lack of effort, despite what Newcastle captain Jamaal Lascelles said about that after the game.\n" +
                        "\n" +
                        "Newcastle's complete surrender' angers Bruce\n" +
                        "They were actually trying to get out to the ball but Leicester had too much quality in possession. Before Newcastle knew it, they were kind of burnt out, and that is when the game really got away from them.",
                rana,
                new GregorianCalendar(2019, Calendar.MARCH, 10), ArticleCategory.SPORT);

        Article article6 = new Article("Jess Phillips abuse: Police called to MP's home three times",
                "MP Jess Phillips said the police were called to her house three times over the weekend amid a \"massive recent increase\" in personal abuse.",
                "nThe Labour MP told BBC Breakfast she had received hundreds of violent messages since a heated Commons debate on Parliamentary language.\n" +
                        "\n" +
                        "She claimed Boris Johnson had a \"direct strategy designed to divide\", which she said was \"working\".\n" +
                        "\n" +
                        "The prime minister denies this and said any threats to MPs were \"deplorable\".\n" +
                        "\n" +
                        "On Friday, a man was charged in connection with a disturbance at Ms Phillips' Birmingham Yardley constituency office the day before.\n" +
                        "\n" +
                        "Ms Phillips has been a high-profile critic of Commons language in recent days.\n" +
                        "\n" +
                        "On Thursday, she used the chamber to ask an urgent question on the topic, urging the prime minister to apologise over terms she said risked inflaming \"hatred and division\".\n" +
                        "\n" +
                        "How many threats do MPs receive?\n" +
                        "Do MPs need to mind their language?\n" +
                        "More news from around the West Midlands\n" +
                        "\"Since last Wednesday of last week I've had hundreds of violent messages and abusive emails,\" she told the programme earlier. These included abuse on social media as well as direct threats.\n" +
                        "\n" +
                        "Ms Phillips said she \"would not claim\" she was always \"well-tempered\" in Parliament.\n" +
                        "\n" +
                        "\"I just wish that we could all temper our language and start talking to each other reasonably about a very difficult issue [Brexit],\" she said.\n",
                chris,
                new GregorianCalendar(2019, Calendar.MARCH, 10), ArticleCategory.UK);


        Article article7 = new Article("Brexit: What happens now?",
                "The Supreme Court has ruled that the suspension of Parliament on 9 September was unlawful and void. MPs returned to Westminster on Wednesday.\n" +
                        "Where does this leave the wider Brexit process and how could it play out over the coming weeks?",
                "A law designed to stop a no-deal Brexit on 31 October has been passed. If a deal is not agreed between the UK and EU by 19 October, and MPs don't vote in favour of leaving with no deal, then the prime minister will be legally obliged to ask the EU for a Brexit delay.\n" +
                        "Get a new deal\n" +
                        "Boris Johnson says he is trying to negotiate a new deal with the EU. If that happened and MPs backed it before 31 October there would be no need for an extension.\n" +
                        "David Frost, the prime minister's lead Brexit negotiator, and Brexit Secretary Stephen Barclay have been meeting EU officials. The prime minister himself has held meetings with the leaders of member states and with Jean-Claude Juncker and Donald Tusk.\n" +
                        "The existing deal negotiated by former Prime Minister Theresa May and her government has been defeated in the House of Commons several times - and Mr Johnson has said it is dead.\n" +
                        "The government wants a deal with the backstop removed. That's the measure aimed at preventing any possibility of border posts and checks between Northern Ireland and the Republic of Ireland.\n" +
                        "There has been some discussion that a possible option could be to go for a Northern Ireland-only backstop. In other words, Northern Ireland would remain more closely tied to the EU than the rest of the UK.\n" +
                        "Critics say that would effectively mean a border in the Irish Sea. When she was in office, Theresa May said that was something no British prime minister could accept.",
                borat,
                new GregorianCalendar(2019, Calendar.SEPTEMBER, 30), ArticleCategory.UK);

        Article article8 = new Article("Cristiano Ronaldo and Lionel Messi: Is their era of dominance heading towards its end?",
                "Seven weeks into the season, Cristiano Ronaldo and Lionel Messi have scored only three club goals between them.",
                "Seven weeks into the season, Cristiano Ronaldo and Lionel Messi have scored only three club goals between them.\n" +
                        "\n" +
                        "The pair have dominated football for the past decade, with a combined 1,369 goals, 10 Ballons d'Or and nine Champions League titles.\n" +
                        "\n" +
                        "But with Barcelona and Argentina's Messi, 32, suffering from multiple injuries already this season and Juventus and Portugal forward Ronaldo, 34, no longer winning golden boots, are we witnessing the beginning of the end of the pair's era of dominance?",
                andy,
                new GregorianCalendar(2019, Calendar.SEPTEMBER, 30), ArticleCategory.SPORT);


        Article article9 = new Article("Rugby World Cup: England's Manu Tuilagi grateful to be in Japan",
                "Of the little green shoots and bright sparks around England's predictably comfortable progress through their opening two World Cup group games, Manu Tuilagi's second try against Tonga perhaps hinted at more than any other.",
                "The first was hardly shabby, as he smashed and twisted and powered through the defensive line.\n" +
                        "\n" +
                        "The second, too, wasn't only about the dummy run that sucked in two defenders and created time and space for the wide pass to Jonny May, or the supporting line to take a return pass from his winger and canter away.\n" +
                        "\n" +
                        "It was all those things, but it was also the smile on Tuilagi's face as he approached the try-line.\n" +
                        "\n" +
                        "No-one else in the England team plays with the same obvious enjoyment as the 28-year-old. And no-one else can quite do what he can when fit and in form.\n" +
                        "\n" +
                        "Tuilagi told BBC 5 Live: \"I always enjoyed rugby, since I started playing. But I just enjoy it more nowadays.\n" +
                        "\n" +
                        "\"I know now that it's not going to last forever, that I have to make the most of it.\n" +
                        "\n" +
                        "\"I'm just happy to be out there. You know, sometimes you take it for granted being able to train and being able to play but for me, going out there is what I love doing.\"\n" +
                        "\n" +
                        "For too much of the past six years Tuilagi has been unlucky with injury but also slow to realise how an international rugby player now has to behave.\n" +
                        "\n" +
                        "Since being one of the few on-pitch positives, aged just 20, as England crashed out of the 2011 World Cup, his list of misdemeanours and misfortunes have been long and varied.\n" +
                        "\n" +
                        "They include jumping off a ferry into Auckland harbour, making a rabbit ears sign behind then-Prime Minister David Cameron's head, punching Chris Ashton, tearing his hamstring, serious problems with both knees, assaulting two female police officers and a taxi driver, and returning to the England hotel drunk during a pre-season training camp.",
                rana,
                new GregorianCalendar(2019, Calendar.OCTOBER, 1), ArticleCategory.SPORT);

        Article article10 = new Article("Wales school sex education classes 'should be compulsory'",
                "Lessons about sexuality and relationships should be compulsory in schools, say Welsh Government advisers on domestic violence.\n" +
                        "\n",
                "Parents would not be able to take children out of classes, under proposals being considered.\n" +
                        "\n" +
                        "The education minister will decide soon whether to make new-look relationships and sexuality education (RSE) compulsory for three to 16-year-olds as part of Wales' new curriculum.\n" +
                        "\n" +
                        "An announcement is expected this week.",
                azamat,
                new GregorianCalendar(2019, Calendar.SEPTEMBER, 30), ArticleCategory.EDUCATION);

        Article article11 = new Article("'Sadfishing' social media warning from school heads",
                "A social-media \"trend\" is leaving young people with genuine mental health problems \"facing unfair and distressing criticism\", private-school leaders say.",
                "\"Sadfishing\" is a growing \"behavioural trend\", where people make \"exaggerated claims about their emotional problems to generate sympathy\", the heads say.\n" +
                        "And it means those with real problems are often overlooked or even bullied.\n" +
                        "Young people are finding sadfishing very \"hard to manage\", the Headmasters' and Headmistresses' Conference says.\n" +
                        "It commissioned a report, Digital Awareness UK, based on interviews with 50,000 pupils in the UK.\n" +
                        "The report quotes a pupil who shared on social media they had been \"feeling really down\".\n" +
                        "\"I got a lot of people commenting on and 'liking' my post but then some people said I was sadfishing, the next day at school, for attention,\" the pupil said.\n" +
                        "Earlier this year a separate, Organisation for Economic Co-operation and Development (OECD) study, of 250,000 teachers in 48 countries, suggested schools in England had the highest incidence of problems with online behaviour.\n" +
                        "It indicated 27% of head teachers in England had to deal with problems related to online bullying every week - compared with an international average of 3%.\n" +
                        "Chris Jeffery, head teacher of Bootham School, in north Yorkshire, who chairs the HMC's wellbeing working group, said social media and mobile technology were now an \"inescapable aspect of the landscape of the lives of young people\".\n" +
                        "\"Given the nature of that technology, trends are fast-moving and it is crucial that educators and parents have regular insights into how young people are using their devices,\" he said.\n",
                borat,
                new GregorianCalendar(2019, Calendar.OCTOBER, 1), ArticleCategory.EDUCATION);

        Article article12= new Article("Is social media causing childhood depression?",
                "Rangan Chatterjee is a GP and says he has seen plenty of evidence of the link between mental ill-health in youngsters and their use of social media.",
                "One 16 year-old boy was referred to him after he self-harmed and ended up in A&E.\n" +
                        "\n" +
                        "\"The first thought was to put him on anti-depressants but I chatted to him and it sounded like his use of social media was having a negative impact on his health.\"\n" +
                        "\n" +
                        "So Dr Chatterjee suggested a simple solution - the teenager should attempt to wean himself off social media, restricting himself to just an hour before he went to bed. Over the course of a few weeks, he should extend this to two hours at night and two in the morning.\n" +
                        "\n" +
                        "\"He reported a significant improvement in his wellbeing and, after six months, I had a letter from his mother saying he was happier at school and integrated into the local community.\"\n" +
                        "\n" +
                        "That and similar cases have led him to question the role social media plays in the lives of young people.",
                chris,
                new GregorianCalendar(2019, Calendar.FEBRUARY, 10), ArticleCategory.EDUCATION);

        Article article13= new Article("Ten films to watch this October",
                "Including The Shining's sequel Doctor Sleep, Joker, and the Palme d’Or-winning Parasite, Nicholas Barber picks the movies not to be missed this month.",
                "Joker won the top prize at this year’s Venice Film Festival, and Joaquin Phoenix is bound to get an Oscar nomination for his scary yet sympathetic central performance. All in all, that’s not bad going for the origin story of a DC Comics’ supervillain. But Todd Phillips’s film is dingier and nastier than the average Batman blockbuster. Set in the 1970s in rundown New York – sorry, Gotham City – it’s a tribute to two of Martin Scorsese’s urban-decay dramas, Taxi Driver and The King of Comedy, and it even has a cameo by their star, Robert De Niro. Does it match up to Scorsese’s own masterpieces? Perhaps not, but Xan Brooks from the Guardian believes that this “gloriously daring and explosive film” is “a tale that’s almost as twisted as the man at its centre, bulging with ideas and pitching towards anarchy”.",
                lawrie,
                new GregorianCalendar(2019, Calendar.SEPTEMBER, 27), ArticleCategory.CULTURE);

        Article article14= new Article("Ten books to read in October",
                "From a head-spinning spy novel to a riveting memoir, Jane Ciabattari picks out some great reads for the month ahead.",
                "Le Carré’s head-spinning new novel is inspired by recent tumultuous global events. Nat, 47, is back in London with his human-rights-lawyer wife Prue, after 25 years running agents in Britain’s Secret Intelligence Service in Moscow, Prague, Bucharest, and other former Soviet strongholds. As one last assignment, Nat is charged with reviving Haven, a London-based Russia outstation he sees as a “dumping ground”. Off-duty, he begins a tactically intricate badminton duel with Ed, a grouchy, distracted young researcher. They settle into a pattern of post-match drinks where Ed rails against Brexit and Trump. Nat even does a bit of matchmaking, introducing Ed to his deputy, Florence. By the time Nat recognises the implications of the radical realignment of the Anglo-American alliance, he finds himself under surveillance.",
                rana,
                new GregorianCalendar(2019, Calendar.SEPTEMBER, 30), ArticleCategory.CULTURE);

        Article article15= new Article("What will art look like in 20 years?",
                "Devon Van Houten Maldonado asks artists and curators to imagine the changes and trends that will influence the art world in the next two decades.",
                "The future may be uncertain, but some things are undeniable: climate change, shifting demographics, geopolitics. The only guarantee is that there will be changes, both wonderful and terrible. It’s worth considering how artists will respond to these changes, as well as what purpose art serves, now and in the future.\n" +
                        "\n" +
                        "Reports suggest that by 2040 the impacts of human-caused climate change will be unescapable, making it the big issue at the centre of art and life in 20 years’ time. Artists in the future will wrestle with the possibilities of the post-human and post-Anthropocene – artificial intelligence, human colonies in outer space and potential doom.\n" +
                        "\n" +
                        "The identity politics seen in art around the #MeToo and Black Lives Matter movements will grow as environmentalism, border politics and migration come even more sharply into focus. Art will become increasingly diverse and might not ‘look like art’ as we expect. In the future, once we’ve become weary of our lives being visible online for all to see and our privacy has been all but lost, anonymity may be more desirable than fame. Instead of thousands, or millions, of likes and followers, we will be starved for authenticity and connection. Art could, in turn, become  more collective and experiential, rather than individual.",
                borat,
                new GregorianCalendar(2019, Calendar.APRIL, 23), ArticleCategory.CULTURE);

        Article article16 = new Article("Volkswagen: Germany's first mass lawsuit begins",
                "Germany's first mass lawsuit begins as 450,000 owners of diesel Volkswagen cars take on the company.",
                "They argue they are owed compensation for being sold cars based on misleading emissions data.\n" +
                        "\n" +
                        "The scandal has already cost VW €30bn (£26.6bn).\n" +
                        "\n" +
                        "It has faced class action claims in the US and Australia, but this is the first time Germans could pursue group claims since the law was changed last year.\n" +
                        "\n" +
                        "This trial will settle points of law and the claimants will later be able to file follow-up claims for compensation if they are successful.\n" +
                        "\n" +
                        "The trial, at Braunschweig Higher Regional Court, about 20 miles from VW's Wolfsburg head office, is likely to last years, however.\n" +
                        "\n" +
                        "Part of VW's settlements so far include a deal to buy back 500,000 cars in the US, where it has agreed to pay more than $25bn (£20bn).\n" +
                        "\n" +
                        "In Australia the company will pay 127 million Australian dollars (£70m) to compensate owners, paying them A$1,400 apiece.\n" +
                        "\n" +
                        "Last week it emerged that three current and former Volkswagen executives were charged with market manipulation in connection with the diesel emissions scandal.\n" +
                        "\n" +
                        "Chief executive Herbert Diess, chairman Hans Dieter Pötsch and ex-boss Martin Winterkorn, did not inform investors early enough about the financial fallout, German prosecutors allege.\n" +
                        "\n" +
                        "In 2015, the firm admitted using illegal software to cheat on emissions tests. VW said it was confident those allegations would prove groundless.\n" +
                        "\n" +
                        "This may be a landmark lawsuit - and in terms of the sheer number of claimants, it's certainly attention grabbing. But it may not be the biggest concern for Volkswagen right now.\n" +
                        "\n" +
                        "Unless there is a settlement, the legal process is likely to take take years - VW expects it to take at least four. Even if they win, car owners will have to go back to court to get compensation.\n" +
                        "\n" +
                        "Meanwhile, VW's chairman and chief executive are both fighting criminal charges for alleged market manipulation linked to the diesel scandal.\n" +
                        "\n" +
                        "Volkswagen itself is facing the possibility of hefty fines from the EU, after being accused of colluding with other manufacturers to delay the introduction of emissions control technology.\n" +
                        "\n" +
                        "It's safe to say its lawyers are already keeping pretty busy at the moment. And in the meantime, the company is trying to turn itself into a leader in the market for electric cars.\n" +
                        "\n" +
                        "Against that background, the group lawsuit may seem for the moment like just another irritation.",
                andy,
                new GregorianCalendar(2019, Calendar.MARCH, 10), ArticleCategory.WORLD);

        Article article17 = new Article("Swiss auction off supercars of Equatorial Guinea leader’s son",
                "A collection of supercars confiscated from the son of Equatorial Guinea's president have been auctioned off in Switzerland.",
                " The cars were seized by Swiss authorities as part of an investigation into Teodorin Nguema Obiang.\n" +
                        "\n" +
                        "He is vice-president to his father, Teodoro Obiang Nguema, who has ruled Equatorial Guinea for 40 years.\n" +
                        "\n" +
                        "Twenty-five of Mr Obiang's cars went under the hammer at a golf club near Geneva on Sunday.\n" +
                        "\n" +
                        "The cars, among them Lamborghinis, Ferraris, Bentleys and Rolls Royces, fetched about $27m (£21.9m; 26m Swiss francs) in total.\n" +
                        "\n" +
                        "Under a deal will prosecutors, some $23m will go to social projects in Equatorial Guinea, a former Spanish colony where poverty is rife.\n" +
                        "\n" +
                        "'$16m seized' from Equatorial Guinea leader's son\n" +
                        "Find out more about Equatorial Guinea\n" +
                        "Who is President Teodoro Obiang Nguema?\n" +
                        "One of the most \"rare and remarkable\" cars, a 2014 Lamborghini Veneno Roadster, was sold for $8.3m to an anonymous buyer.\n" +
                        "\n" +
                        "It is a new world record price for a Lamborghini sold at auction, British auctioneers Bonhams said.\n" +
                        "\n" +
                        "The hammer price for the 354km/h (220mph) car, introduced to celebrate Lamborghini's 50th anniversary, was about 50% more than its pre-sale estimate.\n" +
                        "\n" +
                        "An Aston Martin One-77 Coupe, described as an \"absolute rocket ship\" by the auction house, went for $1.5m.\n" +
                        "\n" +
                        "\"Cars like this would be the jewel of any collection, but to have them all together is really quite extraordinary,\" Lynnie Farrant, press officer for auctioneer Bonhams, told the BBC.\n" +
                        "\n",
                borat,
                new GregorianCalendar(2019, Calendar.MARCH, 10), ArticleCategory.WORLD);

        articleRepo.save(article1);
        articleRepo.save(article2);
        articleRepo.save(article3);
        articleRepo.save(article4);
        articleRepo.save(article5);
        articleRepo.save(article6);
        articleRepo.save(article7);
        articleRepo.save(article8);

        articleRepo.save(article9);
        articleRepo.save(article10);
        articleRepo.save(article11);
        articleRepo.save(article12);
        articleRepo.save(article13);
        articleRepo.save(article14);
        articleRepo.save(article15);
        articleRepo.save(article16);
        articleRepo.save(article17);

    }

}
