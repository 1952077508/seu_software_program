package pub.developers.forum.domain.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author lhs
 * @create 2024/5/15
 * @desc
 **/
public interface GithubService {

    JSONObject getUserInfo(String code);

}
