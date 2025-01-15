CREATE TABLE IF NOT EXISTS Teams (
                       rk INT,
                       year INT,
                       team_name VARCHAR(255),
                       league VARCHAR(50),
                       games INT,
                       wins INT,
                       losses INT,
                       ties INT,
                       win_loss_percentage FLOAT,
                       pyth_win_loss VARCHAR(20),
                       finish VARCHAR(50),
                       games_behind FLOAT,
                       playoffs VARCHAR(50),
                       runs INT,
                       runs_allowed INT,
                       attendance BIGINT,
                       bat_age FLOAT,
                       pitch_age FLOAT,
                       x_bat INT,
                       x_pitch INT,
                       top_player VARCHAR(255),
                       managers VARCHAR(255),
                       current_name VARCHAR(255)
);



CREATE TABLE IF NOT EXISTS Pitchers (
                          player_name VARCHAR(255),
                          position VARCHAR(10),
                          wins INT,
                          losses INT,
                          era FLOAT,
                          games_played INT,
                          games_started INT,
                          complete_games INT,
                          shutouts INT,
                          saves INT,
                          save_opportunities INT,
                          innings_pitched FLOAT,
                          hits_allowed INT,
                          runs_allowed INT,
                          earned_runs INT,
                          home_runs INT,
                          hit_batsmen INT,
                          walks INT,
                          strikeouts INT,
                          whip FLOAT,
                          opponent_avg FLOAT
);


CREATE TABLE IF NOT EXISTS Hitters (
                         player_name VARCHAR(255),
                         position VARCHAR(10),
                         games INT,
                         at_bats INT,
                         runs INT,
                         hits INT,
                         doubles INT,
                         triples INT,
                         home_runs INT,
                         rbis INT,
                         walks INT,
                         strikeouts INT,
                         stolen_bases INT,
                         caught_stealing INT,
                         batting_avg FLOAT,
                         on_base_percentage FLOAT,
                         slugging_percentage FLOAT,
                         ops FLOAT
);




