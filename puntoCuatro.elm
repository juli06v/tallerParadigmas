module Text exposing
    ( Text
    , empty
    , insert
    , delete
    , display
    )


type Text
    = Text (List String)



empty : Text
empty =
    Text []



insert : Int -> String -> Text -> Text
insert position newParagraph (Text paragraphs) =
    let
        before =
            List.take position paragraphs

        after =
            List.drop position paragraphs
    in
    Text (before ++ [ newParagraph ] ++ after)



delete : Int -> Text -> Text
delete position (Text paragraphs) =
    Text
        (List.take position paragraphs
            ++ List.drop (position + 1) paragraphs
        )


display : Int -> Text -> String
display width (Text paragraphs) =
    String.join "\n\n" paragraphs