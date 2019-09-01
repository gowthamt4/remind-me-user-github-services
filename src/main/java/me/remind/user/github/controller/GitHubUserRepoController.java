package me.remind.user.github.controller;

import lombok.extern.slf4j.Slf4j;
import me.remind.user.github.dto.RepositoryDTO;
import me.remind.user.github.service.GitHubService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

/**
 * This is the RestController to invoke GitHub services
 */
@Slf4j
@RestController
@RequestMapping("/users")
public class GitHubUserRepoController {
		/**
		 * Injecting GitHubService
		 */
	    @Autowired
	    GitHubService gitHubService;
	    
	    /**
	     * Service to pull the repo and its corresponding languages for the specific user
	     */
	    @RequestMapping("/{login}/repos")
	    public List<RepositoryDTO> getRepoLanguageServiceResponse(@PathVariable("login") String user) {
	        return gitHubService.getRepositoryLanguageInfo(user);
	    }

}
