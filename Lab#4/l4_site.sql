-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 04 Apr 2016 la 13:33
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `l4_site`
--

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `about`
--

CREATE TABLE IF NOT EXISTS `about` (
  `aboutID` int(1) NOT NULL,
  `descriere` varchar(5000) NOT NULL,
  `categoryID` int(1) NOT NULL,
  PRIMARY KEY (`aboutID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `about`
--

INSERT INTO `about` (`aboutID`, `descriere`, `categoryID`) VALUES
(1, 'Real Madrid C.F. is a Spanish professional association football club based in Madrid. The club was formed in 1902 as Madrid Football Club, and played its first competitive match on May 13, 1902, when it entered the semi-final of the Campeonato de Copa de S.M. Alfonso XIII. Real Madrid currently plays in La Liga, the top tier of Spanish football. Madrid was one of the founding members of La Liga in 1929, and is one of three clubs, including FC Barcelona and Athletic Bilbao, never to have been relegated from the league. They have also been involved in European football ever since they became the first Spanish club to enter the European Cup in 1955, except for the 1977–78 and 1996–97 seasons.\n\nThis list encompasses the major honours won by Real Madrid and records set by the club, their managers and their players. The player records section includes details of the club''s leading goalscorers and those who have made most appearances in first-team competitions. It also records notable achievements by Real Madrid players on the international stage, and the highest transfer fees paid and received by the club.\n\nThe club currently holds the record for the most European Cup / UEFA Champions League triumphs with 10, and the most La Liga titles with 32. The club''s record appearance maker is Raul, who made 741 appearances from 1994 to 2010; the club''s record goalscorer is Cristiano Ronaldo, who has 355 goals in all competitions.', 4);

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `categoryID` int(1) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  PRIMARY KEY (`categoryID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Salvarea datelor din tabel `category`
--

INSERT INTO `category` (`categoryID`, `name`) VALUES
(1, 'Squad'),
(2, 'Latest News'),
(3, 'Trophies'),
(4, 'About RM');

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `players`
--

CREATE TABLE IF NOT EXISTS `players` (
  `playerID` int(2) NOT NULL,
  `name` varchar(30) NOT NULL,
  `categoryID` int(1) NOT NULL,
  `value` varchar(30) NOT NULL,
  `description` varchar(2000) NOT NULL,
  PRIMARY KEY (`playerID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `players`
--

INSERT INTO `players` (`playerID`, `name`, `categoryID`, `value`, `description`) VALUES
(1, 'Florentino Perez', 1, '0.00 m £', 'Florentino Perez Rodriguez is a Spanish businessman, civil engineer, former politician, and current president of Real Madrid, as well as Grupo ACS, a civil engineering company. He is most famous for ushering in Real Madrid''s period of Los Galacticos, a time when the club paid extremely high transfer fees for elite footballers.'),
(2, 'Zinedine Zidane', 1, '0.00 m £', 'Zinedine Yazid Zidane, born 23 June 1972, nicknamed "Zizou", is a retired French footballer and current manager of Real Madrid. He played as an attacking midfielder for the France national team, Cannes, Bordeaux, Juventus and Real Madrid. Renowned for his elegance, vision, ball control and technique, Zidane was named the best European footballer of the past 50 years in the UEFA Golden Jubilee Poll. He is widely regarded as one of the greatest players in the history of the game.\n\nAt club level, Zidane won the La Liga title and the UEFA Champions League with Real Madrid, two Serie A league championships with Juventus and an Intercontinental Cup and a UEFA Super Cup each with both aforementioned teams. His 2001 transfer from Juventus to Real Madrid set a world record fee of an equivalent €75 million. His left-foot volleyed winner in the 2002 UEFA Champions League Final is considered to be one of the greatest goals in the competition''s history. On the international stage with France, Zidane won the 1998 FIFA World Cup, scoring twice in the final, and UEFA Euro 2000 where he was named Player of the Tournament. The World Cup triumph made him a national hero in France, and he received the Légion d''honneur in 1998.'),
(3, 'Keylor Navas', 1, '11.25 m £', 'Keylor Antonio Navas Gamboa (born 15 December 1986), known as Keylor Navas, is a Costa Rican professional footballer who plays for Spanish club Real Madrid and the Costa Rica national team as a goalkeeper.\nAfter starting out at Saprissa he moved to Albacete, and then to Levante in La Liga. Navas joined Real Madrid in 2014 for €10 million.\nNavas has played over 60 times for Costa Rica since making his debut in 2008. He has represented the country at two CONCACAF Gold Cups and the 2014 World Cup; his impressive performances helped the team reach the quarter-finals of the latter tournament.'),
(4, 'Kiko Casilla', 1, '5.25 m £', 'Francisco "Kiko" Casilla Cortes (born 2 October 1986) is a Spanish professional footballer who plays for Real Madrid as a goalkeeper.\nHe started playing for Real Madrid, but only represented the reserve teams in his beginnings. He went on to appear in 126 competitive games for Espanyol over the course of six La Liga seasons, before returning to his previous club in 2015.'),
(5, 'Alvaro Arbeloa', 1, '1.50 m £', 'Álvaro Arbeloa Coca (born 17 January 1983), is a Spanish professional footballer who plays for Real Madrid. He is predominantly a right back, although he can also play on the left side.He started his career with Real Madrid, playing mostly with the reserves. In 2006 he moved to Deportivo de La Coruña, joining Liverpool after half a season and going on to appear in 98 official games over the course of three Premier League seasons. In 2009 he returned to Real Madrid, for a fee of £3,500,000.Arbeloa gained 56 caps for Spain, representing the country at the 2010 World Cup, Euro 2008 and Euro 2012 and winning all tournaments.'),
(6, 'Daniel Carvajal', 1, '18.75 m £', 'Daniel "Dani" Carvajal Ramos (born 11 January 1992) is a Spanish professional footballer who plays for Real Madrid and Spain as a right back.Having risen through the Real Madrid youth ranks, he spent a season with Bayer Leverkusen before breaking into the first team in 2013, going on to win various domestic and international honours.At youth international level, Carvajal won the 2011 European Championship with the under-19 team and the 2013 edition with the under-21 side. He made his senior debut in 2014.'),
(7, 'Danilo', 1, '13.50 m £', 'Danilo Luiz da Silva (born 15 July 1991), known simply as Danilo, is a Brazilian professional footballer who plays for Spanish club Real Madrid as a right back.\n\nHe began his career with América Mineiro before moving to Santos, where he scored the goal that won the 2011 Copa Libertadores. In January 2012 he moved to Porto, where he won consecutive Primeira Liga titles, and signed for Real Madrid for €31.5 million in 2015.\n\nDanilo was first capped by the senior Brazil team in 2011, also winning the 2011 FIFA U-20 World Cup and a silver medal at the 2012 Olympic tournament.'),
(8, 'Fabio Coentrao', 1, '9.00 m £', 'Fabio Alexandre da Silva Coentrao (born 11 March 1988) is a Portuguese professional footballer who plays for French club AS Monaco FC, on loan from Spanish club Real Madrid, and the Portugal national team. Mainly a left back he can also operate as a left winger, and occasionally as a defensive midfielder.After starting playing professionally with Rio Ave, he signed for Benfica at 19, going on to be loaned several times before becoming an important member of the first team, as a left-back. In 2011, he joined Real Madrid.'),
(9, 'Marcelo', 1, '22.50 m £', 'Marcelo Vieira da Silva Junior (born 12 May 1988), known as Marcelo, is a Brazilian professional footballer who plays for Spanish club Real Madrid and the Brazil national team. He plays mainly at left back but can also operate as a left winger.He is very often compared to Roberto Carlos, who himself said Marcelo was his heir, the world''s best left back and that "Marcelo possesses a better technical ability than me".After his breakthrough season, Marcelo was praised by football legends such as Paolo Maldini and Diego Maradona, who also called him the best in his position.'),
(10, 'Nacho', 1, '3.75 m £', 'Jose Ignacio Fernandez Iglesias (born 18 January 1990), commonly known as Nacho, is a Spanish professional footballer who plays for Real Madrid mainly as a central defender but also as a right or left back.'),
(11, 'Pepe', 1, '4.50 m £', 'Kepler Laveran Lima Ferreira (born 26 February 1983), commonly known as Pepe, is a Portuguese professional footballer who plays for Spanish club Real Madrid and the Portuguese national team as a central defender. During his professional career he has played for Marítimo, Porto and Real Madrid, with individual and team success with the latter two clubs. A physically strong and tenacious defender, he is known for his aggressive challenges and for his violent behaviour on the pitch. Born in Brazil, Pepe has represented Portugal over 60 times, playing at two World Cups and two European Championships.'),
(12, 'Raphael Varane', 1, '22.50 m £', 'Raphael Varane (born 25 April 1993) is a French footballer who plays for Spanish club Real Madrid and the French national team, as a central defender. He previously played for French club Lens and, ahead of the 2010–11 season, began training with the senior team and appeared on the bench in several league matches. On 7 November 2010, Varane made his professional debut in a league match against Montpellier. Varane has been described by Lens youth coach Eric Assadourian as a "truly first class player" who is "comfortable on both the tactical and technical level". In January 2014, he was named by The Guardian as one of the ten most promising young players in Europe. Varane was a France youth international, having earned caps at under-18, under-20 and under-21 level. He made his full international debut in March 2013 and represented the country at the 2014 FIFA World Cup.'),
(13, 'Sergio Ramos', 1, '30.00 m £', 'Sergio Ramos Garcia (born 30 March 1986) is a Spanish professional footballer who plays for Real Madrid and the Spain national football team. He serves as captain for Real Madrid. A central defender, he can also play as a right back, a position he primarily fulfilled earlier in his career. After emerging through Sevilla''s youth academy, Ramos went on to be a mainstay for Real Madrid. He won ten major honours for the latter, also being one of La Liga''s top scorers from a defensive position. Internationally Ramos played with the Spanish national team in three World Cups and two European Championships, winning the former tournament in 2010 and the latter in 2008 and 2012. He made his first appearance at the age of 18 and, in 2013, he became the youngest player to ever reach 100 caps.'),
(14, 'Casemiro', 1, '11.25 m £', 'Carlos Henrique Jose Francisco Venancio Casimiro (born 23 February 1992), known as Casemiro, is a Brazilian professional footballer who plays for Spanish club Real Madrid as a defensive midfielder. Formed at São Paulo, where he scored 11 goals in 112 official games, he moved to Real Madrid in 2013, and also spent a season on loan at Porto. A full international since 2011, Casemiro was in Brazil''s squad at the 2015 Copa América.'),
(15, 'Gareth Bale', 1, '60.00 m £', 'Gareth Frank Bale (born 16 July 1989) is a Welsh professional footballer who plays as a winger for Spanish club Real Madrid and the Wales national team. Renowned for his ball striking from distance, swerving free kicks, and his ability to get past defenders with pace, Bale has received plaudits from his peers, who have described him as a footballer with "tremendous speed, great crossing ability, a great left foot and exceptional physical qualities".'),
(16, 'Isco', 1, '33.75 m £', 'Francisco Roman Alarcon Suárez (born 21 April 1992), commonly known as Isco, is a Spanish professional footballer who plays for Real Madrid as an attacking midfielder. He began his career at Valencia, playing mainly in its reserve team, before joining Málaga in 2011. His performances at the Andalusian club earned him the Golden Boy award in 2012, and a €30 million move to Real Madrid in June 2013. Isco represented Spain at various youth levels, including at the 2012 Olympics, and made his senior international debut in 2013.'),
(17, 'James', 1, '60.00 m £', 'James David Rodriguez Rubio (born 12 July 1991), known as James Rodríguez, is a Colombian professional footballer who plays for Spanish club Real Madrid and the Colombia national team as an attacking midfielder or winger. James is commonly ranked as one of the best young players in the world. He is praised for his technique, vision and playmaking skills, and often referred as the successor to his compatriot Carlos Valderrama.'),
(18, 'Lucas Vazquez', 1, '3.75 m £', 'Lucas Vazquez Iglesias (born 1 July 1991) is a Spanish professional footballer who plays for Real Madrid as a right winger. Vazquez made his first appearance in the second level on 17 August 2012, playing six minutes in a 1–2 away loss against Villarreal CF. He scored his first professional goal on 15 October, netting the winner in a 3–2 home success over UD Las Palmas.'),
(19, 'Luka Modric', 1, '37.50 m £', 'Luka Modric (born 9 September 1985) is a Croatian footballer who plays for Spanish club Real Madrid and the Croatia national team. Modric plays mainly as a central midfielder but can also play as an attacking and defensive midfielder.'),
(20, 'Odegaard', 1, '3.00 m £', 'Martin Odegaard (born 17 December 1998) is a Norwegian professional footballer who plays as an attacking midfielder for Spanish club Real Madrid Castilla and the Norway national team.'),
(21, 'M. Kovacic', 1, '15.00 m £', 'Mateo Kovacic (born 6 May 1994) is an Austrian-born Croatian footballer who plays as a midfielder for Spanish club Real Madrid and the Croatia national team. Kova?i? is usually deployed as a central midfielder or deep-lying playmaker, but he is considered to be a versatile midfielder, having played in different positions and adapted to playing either wide on the left or as an attacking midfielder.'),
(22, 'Toni Kroos', 1, '37.50 m £', 'Toni Kroos (born 4 January 1990) is a German professional footballer who plays as a midfielder for Spanish club Real Madrid and the German national team. A member of Bayern Munich''s first team at the age of 17, Kroos became a regular after an 18-month loan spell at Bayer Leverkusen, and won honours including three Bundesliga titles and the 2013 Champions League. After winning the World Cup in 2014, he joined Real Madrid on a six-year contract. He has been praised by journalists and former professionals as a player with all the qualities for the role of an attacking midfielder.'),
(23, 'C. Ronaldo', 1, '82.50 m £', 'Cristiano Ronaldo dos Santos Aveiro, GOIH (born 5 February 1985), known as Cristiano Ronaldo, is a Portuguese professional footballer who plays for Spanish club Real Madrid and the Portugal national team. He is a forward and serves as captain for Portugal. By the age of 22, Ronaldo had received Ballon d''Or and FIFA World Player of the Year nominations. The following year, in 2008, he won his first Ballon d''Or and FIFA World Player of the Year awards. He then won the FIFA Ballon d''Or in 2013 and 2014. In September 2015, Ronaldo scored his 500th senior career goal for club and country.'),
(24, 'Jese', 1, '10.50 m £', 'Jese Rodriguez Ruiz (born 26 February 1993), simply known as Jese, is a Spanish professional footballer who plays for Real Madrid as a forward. A youth product of Real Madrid, he made his senior debuts with the club in 2011 and was promoted to the first team for the 2013–14 season. Jesé earned 36 caps for Spain from under-16 to under-21 level, scoring 16 international goals.'),
(25, 'Karim Benzema', 1, '45.00 m £', 'Karim Mostafa Benzema (born 19 December 1987) is a French professional of Algerian descent footballer who plays for Spanish club Real Madrid and the France national team as a striker. He has been described as an "immensely talented striker" who is "strong and powerful" and "a potent finisher from inside the box". Benzema was born in the city of Lyon and began his football career with local club Bron Terraillon. In 1996, he joined the biggest club in the city, Olympique Lyonnais, and subsequently came through the club''s youth academy. ');

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `position`
--

CREATE TABLE IF NOT EXISTS `position` (
  `positionID` int(1) NOT NULL,
  `descriere` varchar(2000) NOT NULL,
  `categoryID` int(1) NOT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`positionID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `position`
--

INSERT INTO `position` (`positionID`, `descriere`, `categoryID`, `name`) VALUES
(1, 'Real Madrid star Gareth Bale believes his side can still win La Liga after coming from behind to inflict Barcelona’s first defeat in 40 games with a 2-1 victory in El Clasico. Madrid still trail Barca by seven points with seven league games to play, but Bale also highlighted the importance of the victory to Madrid’s confidence ahead of their return to Champions League action against Wolfsburg in the quarter-finals on Wednesday. “If we wanted to win the league this was a game we had to win,” said the Welshman. “You never know, football does funny things to teams when you lose and you never know what could happen. All they need is a few bad results, we need a few good ones and we’re right back in it. “The most important thing today was to get the win to build confidence for the rest of the season. “There’s still the Champions League as well, which we’re really looking forward to.”', 2, '‘Madrid can win La Liga’'),
(2, 'Cristiano Ronaldo struck the winner as 10-man Real Madrid came from behind to end Barcelona’s 39-game unbeaten run with a 2-1 win in El Clasico at the Camp Nou here on Saturday. Gerard Pique’s towering header put the hosts in front on the night they honoured legendary former player and coach Johan Cruyff. Yet, Karim Benzema quickly levelled before Ronaldo fired home five minutes from time after Madrid captain Sergio Ramos had seen the 21st red card of his career. Victory reduces Barca’s lead over third-placed Madrid to seven points with seven games remaining. Atletico Madrid closed the gap on the leaders to six points with a 5-1 thrashing of Real Betis earlier on Saturday. “I liked everything from my players both defensively and offensively against a great team with very good players,” said Madrid boss Zinedine Zidane after a successful first Clasico in charge. “When I see the team like this, fighting for their team-mates, it is the best thing for a coach.”', 2, 'Real end Barcelona run'),
(3, 'Thierry Henry thinks Zinedine Zidane enhanced his managerial credentials by the way he set Real Madrid up in their 2-1 victory over Barcelona on Saturday evening. Having lost to their arch rivals 4-0 at the Bernabeu earlier in the season, Real looked to be heading for another defeat after Gerard Pique scored early in the second half. But Real responded positively, equalising with a bicycle kick from Karim Benzema and then grabbing a late winner through Cristiano Ronaldo after Sergio Ramos was sent off. "I like the way Zidane set up the team," said former Barcelona forward Henry on Sky Sports. "They were not scared, they put pressure on when they needed to and kept their composure at 1-0 down. "They were trying to play from the back under pressure and they looked like a team with the right balance. Zidane understood he had to take care of the midfield, especially against Barcelona. People wanted to know if tactically he could do something against Barcelona and he did."', 2, 'Zidane tactics impress '),
(4, 'Real Madrid''s La Liga season continued with a win against Barcelona at the Nou Camp on Saturday. What a crucial two-one win this was for Real over Barcelona in El Clasico! Not so much with this season''s La Liga in mind as, unless we see Barcelona (unlikely) wobble in the next couple of weeks as Barca (who lost for the first time since October as a 39-match unbeaten run was ended) ''should'' still go on and win the title but if they do and Real keep winning who knows? I''m thinking it''s a crucial win, more with how the Champions League continues to pan out this season and (arguably more so) what it''ll mean for Zinedine Zidane and his Real future? This win ''could'' be the win that ensures he continues as the Los Blancos boss next season.... Before the game, having lost his battle with cancer during the international break, a legend of the game, and he is whatever his Barcelona connections, was paid tribute too when the late, great, Dutch master Johan Cruyff respected.\n', 2, 'Barcelona 1-2 Real Madrid'),
(5, 'After Saturday''s 2-1 Clasico triumph against Barcelona in week 31 of La Liga, Real Madrid went back to train under the command of French head coach Zinedine Zidane in preparation for the Champions League quarter-finals first leg against German football club Wolfsburg next Wednesday.\r\nSatisfied with the result on Saturday, which gave them a boost in morale, the players who started the Clasico completed a recovery session of running exercises and stretches on the field, and worked as well inside the club''s indoor facilities, according to Real Madrid''s official website.\r\nOn the other hand, French defender Raphael Varane continued his rehabilitation, while the rest of the group underwent an intense training session with physical exercises and ball work, reports Efe. After the warm-up, the group completed possession and pressuring exercises and various series of sprints before playing a game of footvolley. Meanwhile, Kiko Casilla, Ruben Yanez, Danilo, Nacho Fernandez, Alvaro Arbeloa, Mateo Kovacic, James Rodriguez, Isco Alarcon, Lucas Vazquez and Jese Rodriguez, worked with more intensity during the session.', 2, 'Champions League');

-- --------------------------------------------------------

--
-- Structura de tabel pentru tabelul `trophies`
--

CREATE TABLE IF NOT EXISTS `trophies` (
  `trophiesID` int(1) NOT NULL,
  `descriere` varchar(3000) NOT NULL,
  `categoryID` int(1) NOT NULL,
  PRIMARY KEY (`trophiesID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Salvarea datelor din tabel `trophies`
--

INSERT INTO `trophies` (`trophiesID`, `descriere`, `categoryID`) VALUES
(1, 'As of 30 December 2015, Real Madrid won a record 32 La Liga and a record 10 European Cup / UEFA Champions League trophies. The club was awarded with the recognition of FIFA Club of the 20th Century on 23 December 2000. It also received the FIFA Order of Merit in 2004. Added to this, Real is allowed to wear a multiple-winner badge on their shirt during UEFA Champions League matches as they have won more than five European Cups.\n\nDomestic honours (most recent triumph in brackets)\nLeague title: 32 (2012)\nSpanish Cup: 19 (2014)\n\nTen-year European record (UEFA Champions league unless indicated otherwise)\n2014/15: semi-finals\n2013/14: winners\n2012/13: semi-finals\n2011/12: semi-finals\n2010/11: semi-finals\n2009/10: round of 16\n2008/09: round of 16\n2007/08: round of 16\n2006/07: round of 16\n2005/06: round of 16.', 3);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
