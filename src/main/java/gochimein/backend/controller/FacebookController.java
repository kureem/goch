package gochimein.backend.controller;

import javax.inject.Inject;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/fb")
public class FacebookController {

	private Facebook facebook;
	private ConnectionRepository connectionRepository;

	@Inject
	public FacebookController(Facebook facebook, ConnectionRepository connectionRepository) {
		this.facebook = facebook;
		this.connectionRepository = connectionRepository;
	}

	@RequestMapping(method = RequestMethod.GET,path="/hello")
	public String helloFacebook(Model model) {
		if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
			return "redirect:/connect/facebook";
		}

		//facebook.friendOperations().getInvitableFriends()
		
		model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
		PagedList<Post> feed = facebook.feedOperations().getFeed();
		
		//return feed;
		model.addAttribute("feed", feed);
		return "hello";
	}
	
	@RequestMapping(method = RequestMethod.GET,path="/friends")
	public String getFriends(Model model){
		if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
			return "redirect:/connect/facebook";
		}

		PagedList<Reference> friends = facebook.friendOperations().getFriends();
		
		
		model.addAttribute("facebookProfile", facebook.userOperations().getUserProfile());
		//PagedList<Post> feed = facebook.feedOperations().getFeed();
		
		//return feed;
		model.addAttribute("feed", friends);
		return "hello";
	}
	


}
