-- FILL OUT ABSOLUTE PATH

COPY Teams (rk, year, team_name, league, games, wins, losses, ties,
    win_loss_percentage, pyth_win_loss, finish, games_behind, playoffs,
    runs, runs_allowed, attendance, bat_age, pitch_age, x_bat, x_pitch,
    top_player, managers, current_name)
    FROM '[PATH]/cleaned_team_data_fixed.csv'
    DELIMITER ','
    CSV HEADER;

COPY Pitchers (player_name, position, wins, losses, era, games_played,
    games_started, complete_games, shutouts, saves,
    save_opportunities, innings_pitched, hits_allowed,
    runs_allowed, earned_runs, home_runs, hit_batsmen, walks,
    strikeouts, whip, opponent_avg)
    FROM '[PATH]/final_baseball_pitcher.csv'
    DELIMITER ','
    CSV HEADER;

COPY Hitters (player_name, position, games, at_bats, runs, hits,
    doubles, triples, home_runs, rbis, walks, strikeouts,
    stolen_bases, caught_stealing, batting_avg,
    on_base_percentage, slugging_percentage, ops)
    FROM '[PATH]/cleaned_baseball_hitting_fixed.csv'
    DELIMITER ','
    CSV HEADER;