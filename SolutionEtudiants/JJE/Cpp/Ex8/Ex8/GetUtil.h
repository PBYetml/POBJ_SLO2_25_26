#pragma once
#pragma once
#include <iostream>
#include <exception>
#include <limits> // Pour numeric_limits

class GetUtil
{
public:
    // Méthodes statiques de saisie qui lancent des exceptions [cite: 23, 24]
    static int GetIntEx();
    static short GetShortEx();
};