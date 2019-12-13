package at.fh.swengb.windisch

object MovieRepository {
    private val movie: List<Movie>

    init {

        movie = listOf(
            Movie("1", "Avengers: Endgame", "22.04.2019",
                "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos's actions and undo the chaos to the universe, no matter what consequences may be in store, and no matter who they face...",
                MovieGenre.ACTION, Person("Joe Russo", "18.07.1971"),
                listOf(Person("Robert Downey Jr.", "04.04.1965"), Person("Mark Ruffalo", "22.11.1967"), Person("Chris Evans", "13.06.1981"), Person("Scarlett Johannson", "22.11.1984")),
                mutableListOf()
            ),
            Movie("2", "Avangers: Infinity War", "23.04.2018",
                "A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment, the fate of Earth and existence has never been more uncertain.",
                MovieGenre.ACTION, Person("Joe Russo", "18.07.1971"),
                listOf(Person("Robert Downey Jr.", "04.04.1965"), Person("Mark Ruffalo", "22.11.1967"), Person("Chris Evans", "13.06.1981"), Person("Scarlett Johannson", "22.11.1984")),
                mutableListOf()
            ),
            Movie("3", "Marvel’s The Avengers", "13.09.2012",
                "The Asgardian Loki encounters the Other, the leader of an extraterrestrial race known as the Chitauri. In exchange for retrieving the Tesseract, a powerful energy source of unknown potential, the Other promises Loki an army with which he can subjugate Earth.",
                MovieGenre.ACTION, Person("Joss Whedon", "23.06.1964"),
                listOf(Person("Robert Downey Jr.", "04.04.1965"), Person("Mark Ruffalo", "22.11.1967"), Person("Chris Evans", "13.06.1981"), Person("Scarlett Johannson", "22.11.1984")),
                mutableListOf()
            ),
            Movie("4", "Frozen 2", "21.11.2019",
                "Set three years after the events of the first film, the story follows Elsa, Anna, Kristoff, Olaf, and Sven, who embark on a journey beyond their kingdom of Arendelle in order to discover the origin of Elsa's magical powers and save their kingdom after a mysterious voice calls out to Elsa.",
                MovieGenre.COMEDY, Person("Jennifer Lee", "22.10.1971"),
                listOf(Person("Kristen Anne Bell", "18.07.1980"), Person("Idina Menzel", "30.05.1971"), Person("Joshua Gad", "23.02.1981")),
                mutableListOf()
            ),
            Movie("5", "Frozen", "19.11.2013",
                "Princess Elsa of Arendelle possesses magical powers that allow her to control and create ice and snow, often using them to play with her younger sister, Anna. After Elsa accidentally injures Anna with her magic, their parents, the King and Queen, take both siblings to a colony of trolls led by Grand Pabbie.",
                 MovieGenre.COMEDY, Person("Jennifer Lee", "22.10.1971"),
                 listOf(Person("Kristen Anne Bell", "18.07.1980"), Person("Idina Menzel", "30.05.1971"), Person("Joshua Gad", "23.02.1981")),
                 mutableListOf()
                ),
            Movie("6", "Joker", "31.08.2019",
                "The story is set in 1981 and follows Arthur Fleck, a failed stand-up comedian who turns to a life of crime and chaos in Gotham City. Always feeling alone in a crowd, the joker looks for getting connected to others as he walks the streets. He lives a poor life with his mother.",
                MovieGenre.HORROR, Person("Todd Phillips", "20.12.1970"),
                listOf(Person("Joaquin Rafael Phoenix", "28.10.1974"), Person("Robert Anthony De Niro", "17.08.1943"), Person("Zazie Olivia Beetz", "25.05.1991")),
                mutableListOf()
                ),
            Movie("7", "The Irishman", "2019",
                "Frank Sheeran has worked for many years as a money collector and problem solver for Mafia boss Russell Bufalino. Before his time as a gangster, Frank drove a car in a butcher's shop and fought against the Axis powers in Sicily and other places during the Second World War, where he also learned the Italian language, not knowing that it was to be his ticket into the world of organized crime. On Russell's recommendation, Jimmy Hoffa (Al Pacino), the union leader associated with the Cosa Nostra, hires him as his bodyguard. First respect develops between the two men, then a close friendship. The more years he moves into the country, the higher Frank rises in the ranks of the mafia and the more cruel the crimes he commits. Then he gets the order to murder Hoffa...",
                MovieGenre.DRAMA, Person("Martin Scorsese", "17.11.1942"),
                listOf(Person("Robert Anthony De Niro", "17.08.1943"), Person("Al Pacino", "25.04.1940"), Person("Joe Pesci", "09.02.1943")),
                mutableListOf()
            ),
            Movie("8", "To All the Boys I’ve Loved Before", "17.08.2018",
                "A teenage girl's secret love letters are exposed and wreak havoc on her love life. Lara Jean Covey writes letters to all of her past loves, the letters are meant for her eyes only. Until one day when all the love letters are sent out to her previous loves.",
                MovieGenre.ROMANCE, Person("Susan Johnson", "18.12.1970"),
                listOf(Person("Lana Condor","11.05.1997"), Person("Noah Centineo", "09.05.1996"), Person("Anna Cathcart", "16.06.2003")),
                mutableListOf()
            ),
            Movie("9", "Booksmart", "24.05.2019",
                "Amy and Molly are two high school seniors who have been best friends since childhood, but are considered pretentious by their peers. Amy has been out for two years and has a crush on a girl named Ryan; Molly urges Amy to attempt to forge a relationship with her before they graduate.",
                MovieGenre.COMEDY, Person("Olivia Wilde", "10.03.1984"),
                listOf(Person("Kaitlyn Dever", "21.12.1996"), Person("Elizabeth Greer \"Beanie\" Feldstein", "24.06.1993"), Person("Billie Lourd", "17.07.1992")),
                mutableListOf()
            ),
            Movie("10", "Once Upon a Time... in Hollywood", "21.05.2019",
                "Set in 1969 Los Angeles, the film follows an actor and his stunt double, as they navigate the changing film industry, and features \"multiple storylines in a modern fairy tale tribute to the final moments of Hollywood's golden age\".",
                MovieGenre.COMEDY, Person("Quentin Tarantino", "27.03.1967"),
                listOf(Person("Brad Pitt", "18.12.1963"), Person("Leonardo DiCaprio", "11.11.1974"), Person("Margot Robbie", "02.07.1990")),
                mutableListOf()
            ),
            Movie("11", "Aquaman", "21.12.2018",
                "In Maine, 1985, lighthouse keeper Tom Curry rescues Atlanna, the princess of the underwater nation of Atlantis, and they fall in love and have a son, Arthur Curry, who is born with the power to communicate with marine lifeforms. Atlanna is forced to abandon her family and return to Atlantis, entrusting to her loyal advisor Nuidis Vulko the mission of training Arthur. Under Vulko’s guidance, Arthur becomes a skilled warrior, but is rejected by the Atlanteans for being a half-breed and ultimately leaves Atlantis behind.",
                MovieGenre.ACTION, Person("James Wan", "26.02.1977"),
                listOf(Person("Jason Momoa", "01.08.1979"), Person("Amber Heard", "22.04.1986"), Person("Patrick Wilson", "03.07.1973"), Person("Nicole Kidman", "20.06.1967")),
                mutableListOf()
            ),
            Movie("12", "Mission: Impossible – Fallout", "12.06.2018",
                "Ethan Hunt's team joins forces with CIA assassin August Walker to prevent an epic disaster. Arms dealer John Lark and a group of terrorists plan to use three plutonium nuclei for a nuclear attack on the Vatican, Jerusalem and Mecca, Saudi Arabia. When the weapons are lost, Ethan and his crew find themselves in a desperate race against time to prevent them from falling into the wrong hands.",
                MovieGenre.ACTION, Person("Christopher McQuarrie", "12.06.1968"),
                listOf(Person("Tom Cruise", "03.07.1962"), Person("Rebecca Ferguson", "19.10.1983"), Person("Henry Cavill", "05.05.1983")),
                mutableListOf()
            ),
            Movie("13", "The Nun", "05.09.2018",
                "In a monastery in Romania a young nun takes her own life. A priest with a cursed past and a novice on the threshold of her last vow from the Vatican are then sent for examination. The two risk their lives together to unravel the sinful mystery of the Order. They must also risk their faith and souls by facing a malicious power.",
                MovieGenre.HORROR, Person("Corin Hardy", "06.01.1975"),
                listOf(Person("Taissa Farmiga", "17.08.1994"), Person("Demián Bichir", "01.08.1963"), Person("Bonnie Aarons", "03.06.1979")),
                mutableListOf()
                ),
            Movie("14", "Conjuring", "05.07.2013",
                "Carolyn and Roger Perron move with their five girls to a farmhouse in Rhode Island. When they discover a hidden basement room, it's quickly over. Inexplicable incidents scare the Perrons and escalate into real terror. At the end of her rope, Carolyn asks parapsychologists Ed and Lorraine Warren for help.",
                MovieGenre.HORROR, Person("James Wan", "26.02.1977"),
                listOf(Person("Vera Farmiga", "06.08.1973"), Person("Patrick Wilson", "03.07.1973"), Person("Lili Taylor", "20.02.1967")),
                mutableListOf()
                ),
            Movie("15", "Conjuring 2", "13.11.2016",
                "In 1977, the respected American demonologists Ed and Lorraine Warren travel to Europe to investigate a case in London's Enfield district. The house of single mother Peggy Hodgson and her four children is not doing the right thing. The youngest daughter Janet becomes the victim of a demon several times. However, when trying to help the girl, even the experienced ghost hunters soon reach their limits.",
                MovieGenre.HORROR, Person("James Wan", "26.02.1977"),
                listOf(Person("Vera Farmiga", "06.08.1973"), Person("Patrick Wilson", "03.07.1973"),Person("Madison Wolfe", "16.10.2002")),
                mutableListOf()
                )
        )

}
    fun movieList(): List<Movie>{
        return movie
    }
    fun movieById(id: String): Movie?{
        return movie.find { it.id == id }
    }
    fun rateMovie(id: String, review: Review){
        movieById(id)?.reviews?.add(review)
    }}