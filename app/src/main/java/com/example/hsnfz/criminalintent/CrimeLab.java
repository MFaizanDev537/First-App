package com.example.hsnfz.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private List<Crime> mCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public void addCrime(Crime c){
        mCrimes.add(c);
    }

    private CrimeLab(Context context) {

        mCrimes = new ArrayList<>();
     }

    public List<Crime> getmCrimes() {
        return mCrimes;
    }

    public Crime getCrimes(UUID Id) {

        for (Crime crime : mCrimes) {
            if (crime.getId().equals(Id)) {
                return crime;
            }
        }
        return null;
    }
}
