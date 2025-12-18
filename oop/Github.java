import java.util.*;

class GitCommitHistory{
	private String ownerName;
	private String repoName;
	private String message;
	private String date;
	
	//Constructor
	GitCommitHistory(String ownerName, String repoName, String message, String date){
		this.ownerName = ownerName;
		this.repoName = repoName;
		this.message = message;
		this.date = date;
	}
	//Getters
	public String getOwnerName(){
		return ownerName;
	}
	public String getRepoName(){
		return repoName;
	}
	public String getMessage(){
		return message;
	}
	public String getDate(){
		return date;
	}
	//Setters
	public void setOwnerName(String ownerName){
		this.ownerName = ownerName;	
	}
	public void setRepoName(String repoName){
		this.repoName = repoName;
	}
	public void setMessage(String message){
		this.message = message;
	}
	public String toString(){
		return "Owner: " + ownerName + ", Repo: " + repoName + ", Message: " + message + ", Date: " + date;
	}

}
class Repository{
	private String repoName;
	private int repoId;
	private GitCommitHistory [] gch;
	
	//Constructor
	Repository(String repoName, int repoId, GitCommitHistory [] gch){
		this.repoName = repoName;
		this.repoId = repoId;
		this.gch = gch;
	}
	//Getters
	public String getRepoName(){
		return repoName;
	}
	public int gerRepoId(){
		return repoId;
	}
	public GitCommitHistory [] getGCH(){
		return gch;
	}
	//Setters
	public void setRepoName(String repoName){
		this.repoName = repoName;
	}
	public void setGCH(GitCommitHistory [] gch){
		this.gch = gch;
	}
	public void printGit(){
		System.out.println("The info about this repo is: " + repoName + " " + repoId);
		for(GitCommitHistory g : gch){
			System.out.println(g);
		}
	}
}
public class Github{
	public static void main(String [] args){
		GitCommitHistory [] gg = new GitCommitHistory[3];
		gg[0] = new GitCommitHistory("Varnit", "Java", "Ok", "12/12/2025");
		gg[1] = new GitCommitHistory("Varnit", "Java", "lets", "12/13/2025");
		gg[2] = new GitCommitHistory("Varnit", "Java", "Code", "12/14/2025");

		Repository r = new Repository("Learn Java",4555 , gg);
		r.printGit();
	}
}
