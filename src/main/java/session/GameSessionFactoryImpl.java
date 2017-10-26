package session;

public class GameSessionFactoryImpl implements GameSessionFactory {

	public GameSession getTrueFalseGameSession() {
		return new TrueFalseGameSession();
	}

}
