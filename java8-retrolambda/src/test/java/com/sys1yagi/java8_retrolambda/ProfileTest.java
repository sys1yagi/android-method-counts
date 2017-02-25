package com.sys1yagi.java8_retrolambda;

import org.junit.Before;
import org.junit.Test;

import static com.sys1yagi.java8_retrolambda.testtool.Spec.it;
import static org.assertj.core.api.Assertions.assertThat;

public class ProfileTest {

    public static class 認証をしていないとき {

        Client client;

        @Before
        public void setUp() {
            client = new Client();
        }

        @Test
        public void プロフィール情報にアクセスすると() throws Exception {
            Response response = client.get("/v1/profile");
            it("401が返ってくる", () -> {
                assertThat(response.status()).isEqualTo(401);
            });
        }
    }

    static class Client {

        public Response get(String url) {
            return new Response();
        }
    }

    static class Response {

        int status() {
            return 401;
        }
    }
}
