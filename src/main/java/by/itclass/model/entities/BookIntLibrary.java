package by.itclass.model.entities;

import lombok.*;


@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class BookIntLibrary {
    private String title;
    private int pages;

    @NonNull
    private int library_id;
}
