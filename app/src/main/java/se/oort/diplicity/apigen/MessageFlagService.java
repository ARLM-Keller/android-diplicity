package se.oort.diplicity.apigen;
	
import retrofit2.http.*;
import rx.*;
	
public interface MessageFlagService {
  @POST("/Game/{game_id}/Channel/{channel_members}/MessageFlag")
  Observable<SingleContainer<MessageFlag>> MessageFlagCreate(@Body MessageFlag messageflag, @Path("game_id") String game_id, @Path("channel_members") String channel_members);

}