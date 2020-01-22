
package in.example.minimal.requestDto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@SuppressWarnings("unused")
public class Methods {

    private GET get;
    private Post post;
    private Update update;

}
