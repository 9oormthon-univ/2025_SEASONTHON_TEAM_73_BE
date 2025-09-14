package com.season.livingmate.gpt.api.dto.response;

import java.util.List;

public record GptResponse(
        List<Choice> choices
) {
    public record Choice(
            Message message
    ){
        public record Message(
                String content
        ){}
    }
}
