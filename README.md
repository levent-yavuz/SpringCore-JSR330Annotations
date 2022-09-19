# JSR330 Standart Annotations

Spring offers support for JSR-330 standard annotations (Dependency Injection)

@Inject is used to Dependency Injection instead of @Autowired annotation

@Named annotation should be used with a qualified name for dependency that should be injected

@Named annotation could use instead of @Component annotation. 

## TeamDAOImpl Class
```
@Named
public class TeamDAOImpl implements TeamDAO{

	@Override
	public void insertTeam(Team team) {
		// TODO Auto-generated method stub
	
		teams.add(team);
		//System.out.println( team.getName() + " is inserted");	
	}

	@Override
	public void displayTeams() {
		
		teams.stream().forEach(System.out::println);
	}
}
```
## TeamServiceImpl Class
```
@Named
public class TeamServiceImpl implements TeamService{

	@Inject
	TeamDAO teamDAO;

	public void insertTeam(Team team) {
		
		teamDAO.insertTeam(team);
		
//		System.out.println("TeamService inserted Team ");
	}

	@Override
	public void displayTeams() {
		
		teamDAO.displayTeams();	
	}
}
```
