package ArtistWeb

object ArtistWeb extends App {

  sealed trait Artist{
    def collab(artist: Artist): String = s"$name frequently collabnorates with $artist"
  }

  sealed trait MusicalArtist
  def collab(artist: MusicalArtist): String = s"$name frequently collabnorates with $artist"
}

abstract class Rapper(name: String, album: String, tier: String ) {

  def sings(melody: String): Boolean = melody == album
  def collab(artist: Rapper): String = s"$name frequently collaborates with $artist"
  def skill(skill: String): Boolean = skill == tier
  def isAlive: String = s"$name is alive and well. "
}

abstract class Singer(name: String, album: String, tier: String){

  def sings(melody: String): Boolean = melody == album
  def collab(artist: Rapper, songbird: Singer): String = s"$name frequently collaborates with $artist || $songbird"
  def skill(skill: String): Boolean = skill == tier
  def isAlive: String = s"$name is alive and well. "
}

abstract class Producer(name: String, album: String, tier: String){

  def sings(melody: String): Boolean = melody == album
  def collab(artist: Rapper, songbird: Singer): String = s"$name frequently collaborates with $artist || $songbird"
  def skill(skill: String): Boolean = skill == tier
  def isAlive: String = s"$name is alive and well. "
}





// Constructors
val jayZ = new Rapper("Jay-Z", "The Blueprint", "Legend")
val fiftyCent = new Rapper("50 Cent", "Get Rich or Die Tryin'", "Legend")
val ti = new Rapper("T.I.", "Paper Trail", "Legend")
val jCole = new Rapper("J. Cole", "2014 Forest Hills Drive", "New Elite")
val kendrickLamar = new Rapper("Kendrick Lamar", "To Pimp a Butterfly", "New Elite")
val kodakBlack = new Rapper("Kodak Black", "Project Baby", "Young Bucks")

println(jayZ.collab(ti:Rapper))
}

