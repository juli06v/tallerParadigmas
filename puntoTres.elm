module Date exposing
    ( Date
    , date
    , isEqual
    , isBefore
    )

type Date
    = Date Int Int Int


date : Int -> Int -> Int -> Date
date day month year =
    Date day month year



isEqual : Date -> Date -> Bool
isEqual (Date d1 m1 y1) (Date d2 m2 y2) =
    d1 == d2 && m1 == m2 && y1 == y2



isBefore : Date -> Date -> Bool
isBefore (Date d1 m1 y1) (Date d2 m2 y2) =
    if y1 < y2 then
        True
    else if y1 == y2 && m1 < m2 then
        True
    else if y1 == y2 && m1 == m2 && d1 < d2 then
        True
    else
        False