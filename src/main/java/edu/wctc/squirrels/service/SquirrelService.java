package edu.wctc.squirrels.service;

import edu.wctc.squirrels.entity.Squirrel;

import java.util.List;

public interface SquirrelService {
    Squirrel getSquirrel(int squirrelId);

    void updateSquirrelRanking(Squirrel ranking);

    List<Squirrel> getSquirrelList();
}