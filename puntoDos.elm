module Complex exposing
    ( Complex
    , complex
    , magnitude
    , add
    , subtract
    , multiply
    )



type Complex
    = Complex Float Float

complex : Float -> Float -> Complex
complex real imag =
    Complex real imag


magnitude : Complex -> Float
magnitude (Complex real imag) =
    sqrt (real^2 + imag^2)



add : Complex -> Complex -> Complex
add (Complex r1 i1) (Complex r2 i2) =
    Complex (r1 + r2) (i1 + i2)


subtract : Complex -> Complex -> Complex
subtract (Complex r1 i1) (Complex r2 i2) =
    Complex (r1 - r2) (i1 - i2)


multiply : Complex -> Complex -> Complex
multiply (Complex r1 i1) (Complex r2 i2) =
    Complex
        (r1 * r2 - i1 * i2)
        (r1 * i2 + i1 * r2)